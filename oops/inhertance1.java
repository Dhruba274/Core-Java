package oops;

//single level inheritance
class papa{
    int property=1000;

}
class beta extends papa
{
    public static void main(String[] args) {
        beta s=new beta();
        }   
        }
class pota extends beta{

}

interface Swiming{
    void swim();
}
interface Flying{
    void fly();
}
//This is an example of multiple inheritance as the birfd implement both flying and swiming
class Bird implements Swiming,Flying{//The type Bird must implement the inherited abstract method Swiming.swim()
    public void swim() {
        System.out.println("Swiming");
        }
        public void fly() {
            System.out.println("Flying");
            }
            }
            //This below class implementation is hierarychal implementation 
class newbird extends Bird{

}

public class inhertance1 {
    public static void main(String[] args) {
        Bird b=new Bird();
        b.swim();
        b.fly();
        pota pintu= new pota();
        System.out.println(pintu.property);
        }
}
