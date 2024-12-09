package synchronization;

class BookTicketSeat{
     int total_seat=10;
      void book_seat(int seat){
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
//This program describe the inconsistency in this program as it is not well defined by synchroniazation

public class MovieBookApp extends Thread{
    static BookTicketSeat book;
    int seats;
    public void run(){
     
        book.book_seat(seats);

    }
    public static void main(String[] args) {
        
        book=new BookTicketSeat();
        MovieBookApp mv=new MovieBookApp();
        mv.seats=7;
        mv.start();
        MovieBookApp mv1=new MovieBookApp();
        mv1.seats=6; 
        mv1.start();

    }   
}



