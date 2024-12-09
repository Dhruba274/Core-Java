package thread_prog;

public class Thread_construct implements Runnable {
    public void run() {
        System.out.println("Thread is running");
        } 
        public static void main(String[] args) {
            Thread t = new Thread(new Thread_construct());
            t.start();
            System.out.println("Thread is started");
            }
} 
