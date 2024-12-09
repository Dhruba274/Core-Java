package thread_prog;

public class join_method extends Thread {
   
    public void run(){
      
        try{
        for(int i=0;i<6;i++){
           //jm.join();
            System.out.println("Child Thread "+i);
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        join_method jm=new join_method();
        jm.start();
        try{
            for(int i=0;i<6;i++){
                jm.join();//It will stop main method execution and allow child thread to execute properly . No new thread will excute untill the previous thtread is excuted completely
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
                
            }
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}
