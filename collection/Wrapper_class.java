package collection;

public class Wrapper_class {
    
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // Integer wrapper class
        //Use of @SuppressWarnings is to suppress or ignore warnings coming from the compiler, i.e., the compiler will ignore warnings if any for that piece of code.
        Integer in = 10; // Autoboxing
        Integer i = new Integer(1);
        Integer intg= Integer.valueOf(1) ;
        int age=i;//We assigned a object in int this is unboxing
       System.out.println(Integer.toString(1));
        
    }
    
}
