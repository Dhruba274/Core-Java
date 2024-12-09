package oops;
/**
 * InnerInterFace
 */
 interface InnerInterFace {
    default void show(){
        System.out.println();
        //Default methods can specifies body
        System.out.println("Default inteface method");
    }
    public static void run(){
        //static methods can also be specified
        System.out.println("Static methods");
    }
    int sum(int a ,int b);//Method which cant be specified. By default the compiler will give the public access modifier and abstract
    
}
abstract class Abstractclass implements InnerInterFace{
    //While it is a abstarct class it does'nt required to implement the all the interface inherited methods within the class   
        public static void run(){
            
        }

        public int sum(int a ,int b){
            return a+b;
        }
        public static void main(String[] args) {
            Abstractclass a =new Abstractclass() {
                
            };
           System.out.println(a.sum(4, 50)); 
        }
        
    
}
class InterFace implements InnerInterFace {
    public void show(){
        System.out.println("d");
    }
        public static void run(){
            
        }

        public int sum(int a ,int b){
            return a+b;
        }
    public static void main(String[] args) {
        InterFace.run();
        InterFace inter =new InterFace();
        inter.show();
        System.out.println();
        System.out.println(inter.sum(2, 90));
        
    }

}
