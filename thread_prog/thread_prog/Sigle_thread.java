package thread_prog;

public class Sigle_thread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread is running");
            }
    }
    public static void main(String[] args) {
        Sigle_thread t=new Sigle_thread();
        t.start();
        }
    
}
