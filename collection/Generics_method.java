package collection;

public class Generics_method {
   public static void main(String[] args) {
    printdata(1);
    printdata(1.0);
    printdata("Hello");//It can work with any type of data as it is parameterized method
    printdata(10);
    Generics_method n= new Generics_method();
    n.doubleData(45);
   }
   static <T> void printdata(T data){
    System.out.println(data);
   } 
   <E extends Number> void doubleData(E data){//This method will only support number 
    System.out.println(data);
   
   }

}
