package thread_prog;

public class Thread2 implements Runnable {
    public void run() {
        System.out.println("Thread 2 is running");
    }
    public static void main(String[] args) {
        Thread2 th=new Thread2();
        Thread t=new Thread(th);
        t.start();
    }

    
}
