  package thread_prog;

public class Get_Thread extends Thread
 {
            public void run(){//We have to give the public access modifier else it will show the error as it inherits from interface implements
        System.out.println("Run method is TASK");
        System.out.println(Thread.currentThread().getName());
    }
public static void main(String[] args) {
    // Create a new thread
        System.out.println(Thread.currentThread().getName());//Outp[ut: main
        Thread.currentThread().setName("Dhruv");
        System.out.println(Thread.currentThread().getName()); //Output : Dhruv
        Get_Thread t1=new Get_Thread();//New Thread
        t1.start();//This will start excuting the 0th Thread
        //System.out.println(Thread.currentThread().getName());
        Get_Thread t2=new Get_Thread();
        t2.setName("Messi");
        t2.start();
        System.out.println(Thread.currentThread().isAlive());//This is the excution portion of main thread so it will excute first
    }

}
