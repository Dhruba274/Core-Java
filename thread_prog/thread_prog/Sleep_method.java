package thread_prog;

public class Sleep_method extends Thread {
    //Sleep Method
public void run(){
    for(int i=0;i<5;i++){
           //Thraed-0
        try{
            
            System.out.println("Child thread this is"+i);
            Thread.sleep(2000);//The sleep method in Thread class stop the execution for some time 
        }
        catch(InterruptedException e){
            System.out.println(e);

        }

    }

}
    public static void main(String[] args) { 
        //Main thraed
        Sleep_method sm=new Sleep_method();
        sm.start();
        for(int i=0;i<5;i++){
            //Thraed-0
         try{
             Thread.sleep(2000);//The sleep method in Thread class stop the execution for some time 
             System.out.println("HI main thread this is"+i);
         }
         catch(InterruptedException e){
             System.out.println(e);
 
         }
 
     
        
    }
}
}