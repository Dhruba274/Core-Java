package thread_prog;

class Medical extends Thread{
    public void run(){
        try{
            System.out.println("Medical starts");
            Thread.sleep(2000);
            System.out.println("Medical completed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
class TestDriver extends Thread{
    public void run(){
        try{
            System.out.println("Test drive starts");
            Thread.sleep(2000);
            System.out.println("Test drive completed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class OfficerSign extends Thread{
    public void run(){
        try{
            System.out.println("Officer takes file");
            Thread.sleep(2000);
            System.out.println("Work completed");
        }
        catch (Exception e){

        }
    }
}
public class LicenceDemo{
    public static void main(String[] args) throws InterruptedException {
        Medical md=new Medical();
        md.start();
        md.join();
        TestDriver td=new TestDriver();
        td.start();
        td.join();
        OfficerSign os=new OfficerSign();
        os.start();
    }
}