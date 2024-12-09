package exception;

public class Exception1 {
    public static void main(String[] args) {
        int arr[]=new int [2];
        try{
            int a=4/0;
            System.out.println(arr[3]);
            }catch (ArrayIndexOutOfBoundsException  | NullPointerException n){
                System.out.println("ArrayIndexOutOfBoundsException");//This try catch functioning will not terminate the code rather it will send the message and excute the rest of the code
                }catch (ArithmeticException s){
                    System.out.println(s.getStackTrace());
                
                }
        
                System.out.println("rest of the code");
                
    }
}
