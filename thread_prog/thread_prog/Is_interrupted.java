package thread_prog;



public class Is_interrupted extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().isInterrupted());//It will provide true and stop the execution 
        try{
            for(int i=1;i<6;i++){
            System.out.println("HI");
        Thread.sleep(1000);
            }
    }
    catch (InterruptedException e){System.out.println("Caught"+e);}
        
    }




    public static void main(String[] args) {
        Is_interrupted t = new Is_interrupted();
        t.start();
        t.interrupt();//It will only work when the thread is in wait or sleep
    }
}

