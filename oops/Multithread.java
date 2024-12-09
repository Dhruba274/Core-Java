package oops;
class thread1 extends Thread{
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Thread 1 is running"+i);
            }

    
    }
}
class thread2 implements Runnable{

    @Override
    public void run() {
        
        for(int i=0;i<5;i++) {
            System.out.println("Thread 2 is running"+i);
            }
       
    }

}
public class Multithread {
    public static void main(String[] args) {
        thread1 t1= new thread1();
        thread2 t2= new thread2();
        Thread th= new Thread(t2);
        t1.start();
        th.start();
       // t2.run();
    }
    
}
