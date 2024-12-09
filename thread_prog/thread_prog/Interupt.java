package thread_prog;

public class Interupt  extends Thread{
    
    public void run(){
        try{
        for(int i=0;i<10;i++){
        System.out.println(i);
        Thread.sleep(1000); // The sleep method should be called to excute the Interrupt method
        }
        }
        catch(Exception e){
            System.out.println("Exception caught"+e);
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Interupt inp=new Interupt();
        inp.start();
        inp.interrupt();
    }
    
}
