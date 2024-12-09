package thread_prog;

public class Single_mul extends Thread{
    public void run() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 * num2;
        System.out.println("Result of multiplication is: "+result);
    
    }
    public static void main(String[] args) {
        Single_mul t1 = new Single_mul();
        t1.start();
        Single_mul t2=new  Single_mul();
        t2.start();
        //So we create multiple thread to access same task
        //Here Created 3 threads along with main thread which is created by JVM itself
        }

            
}
