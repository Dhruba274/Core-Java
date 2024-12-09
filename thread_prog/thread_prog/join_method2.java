package thread_prog;

public class join_method2 extends Thread {
    static Thread mainthread;
    public void run(){
        // join_method jm=new join_method();\
       
         try{
            //mainthread.join();
         for(int i=0;i<6;i++){
            mainthread.join();
             System.out.println("Child Thread"+i);
             Thread.sleep(1000);
         }
         }
         catch(Exception e){
             System.out.println(e);
         }
     }
     public static void main(String[] args) throws InterruptedException{
        mainthread=Thread.currentThread();
         join_method2 jm=new join_method2();
         jm.start();
         //jm.join();
         try{
             for(int i=0;i<6;i++){
                // jm.join();//It will stop main method execution and allow child thread to execute properly
                 System.out.println("Main Thread"+i);
                 Thread.sleep(1000);
                 
             }
             }
             catch(Exception e){
                 System.out.println(e);
             }
     }
    
}
