package thread_prog;
//To perform multiple task we can create multiple classes to extend the thread class and to excute it
public class Multiple_multiple extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is running");
            }
            }
 
}
class Mythread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 is running");
            }
            }
            
}
class Test{
    public static void main(String[] args) {
        Multiple_multiple t1 = new Multiple_multiple();
        t1.start();
        Mythread t2 = new Mythread();
        t2.start();
    }
}