package thread_prog;

public class Daemon_thread extends Thread{
    public void run(){
        System.out.println("Daemon Thread");
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
       
        System.out.println("Main thread");
        Daemon_thread dm=new Daemon_thread();
        dm.setDaemon(true);//It will not excute untill the main or the parent thread start it excuting
        //You have to create daemon thread before start the thread
        dm.start();
        System.out.println(Thread.currentThread().getName());
        //System.out.println(Thread.currentThread().getName());
       
    }
    
}
