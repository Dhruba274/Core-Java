package oops;
abstract  class AbstractClass{
    public abstract void display();//You can not declare any body code in the abstract class
    void call(){//But you can declare any method in abstract class
        System.out.println("This is a abstract class");
        
    }
    

}
interface interFaceAbs{
    public abstract void display();
//     void avs(){//Abstract methods do not specify a body
//         System.out.println("This is a interface");
//     }
 }
public class abstraction {
    public static void main(String[] args) {
        AbstractClass s=new AbstractClass(){
            public void display(){
                System.out.println("ss");
            }
        };
        s.display();
        s.call();
        interFaceAbs ss=new interFaceAbs() {
            public void display(){
                
            }
        };
        
    }
}
