package oops;

class A{
    void show(){
        System.out.println("A show");
    }
}

class B extends A{
    @Override
    void show (){
        System.out.println("B class");
    }
}
public class polymorphism {
//compile time polymorphism--->Method Overloading
int add(int a,int b){
    return a+b;
}
int add(float a,float b){
    return (int)(a+b);
}
//runtime polymorphism--->Method Overriding
    public static void main(String[] args) {
        A a=new A();
        a.show();
        B b=new B();
       b.show();
        
    }
    
}
