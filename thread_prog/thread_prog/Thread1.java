package thread_prog;

public class Thread1 extends Thread {
    public void run(){
        System.out.println("Thread 1 is running");
    }
    public static void main(String[] args) {
        //Impleenting   with Thread class
        Thread1 t1 = new Thread1();
        t1.start();
    }
}
