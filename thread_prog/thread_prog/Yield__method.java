package thread_prog;

public class Yield__method extends Thread{
    public void run(){
        for(int i=1; i<=5;i++)
        System.out.println(Thread.currentThread().getName()+i);
    }
    
    public static void main(String[] args) {
        Yield__method th=new Yield__method();
        th.start();
        Thread.yield();//If wants to stop main method and provide to chance other threads
        for(int i=0;i<8;i++){ 
             
        System.out.println(i);
             //output may be different   
     }
    }
    //In yeild method the running thread give the call that it may stop if other process wants to excute
}
   