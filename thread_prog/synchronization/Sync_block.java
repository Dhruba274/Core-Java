package synchronization;

class BookingSeat{
     int total_seat=10;
     void book_seat(int seat){
        synchronized(this){//This synchronized block is used for only using this block as synchronized
        if(total_seat>=seat){
            System.out.println(Thread.currentThread().getName() + " - Seat booked");
            total_seat-=seat;
            System.out.println(Thread.currentThread().getName() + " - Seats left: " + total_seat);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " - Seats can't be booked. Not enough seats available.");
            System.out.println(Thread.currentThread().getName() + " - Seats left: " + total_seat);
        }
    } 

    }
}
//This program describe the inconsistency in this program as it is not well defined by synchroniazation

public class Sync_block extends Thread{
    static BookingSeat book;
    int seats;
    public void run(){
     
        book.book_seat(seats);

    }
    public static void main(String[] args) {
        
        book=new BookingSeat();
        Sync_block mv=new Sync_block();
        mv.seats=7;
        mv.start();
        Sync_block mv1=new Sync_block();
        mv1.seats=6; 
        mv1.start();

    }   
}





