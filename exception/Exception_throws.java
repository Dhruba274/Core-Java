package exception;
import java.util.*;
public class Exception_throws {
    static int get(int a[]) throws ArrayIndexOutOfBoundsException{
        return a[0];
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(get(arr));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Catch the ArrayIndexOutOfBoundsException"+e.getMessage());
        }
        finally{
            System.out.println("Finally block is executed");
        }
        String st="Dh";
        System.out.println(st.getClass());
    }
    
}
