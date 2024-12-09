package thread_prog;

public class Priority_thread extends Thread{
    /*
     1--MIN_PRIORITY
     5--NORM__PRIORITY
     10--MAX_PRIORITY
    */
    public void run(){
        System.out.println("Child Thread ");
        Thread.currentThread().setPriority(2);//Child thread will always inherit the priority from parent thread
        System.out.println("Child thread priority "+Thread.currentThread().getPriority());
        
    }
    
    public static void main(String[] args) {
        System.out.println("Main Thread "+Thread.currentThread().getPriority());
        Priority_thread pt=new Priority_thread();
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread New priority "+Thread.currentThread().getPriority());
        //pt.setPriority(1);
        pt.start();
    
}
}
