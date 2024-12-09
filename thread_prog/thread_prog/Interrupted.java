package thread_prog;

public class Interrupted extends Thread {
    public void run(){
        System.out.println(Thread.interrupted());//It will provide true and change the interrupted status to false and also excute the code
        try{
            for(int i=1;i<6;i++){
            System.out.println("HI");
        Thread.sleep(1000);
        }
    }
    catch (InterruptedException e){System.out.println("Caught"+e);}
    System.out.println(Thread.interrupted());
    }




    public static void main(String[] args) {
        Interrupted t = new Interrupted();
        t.start();
        t.interrupt();//It will only work when the thread is in wait or sleep
    }
}
