import java.util.*;
public class ArrayIntro {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the array size");
        n=sc.nextInt();
        int array[] =new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The array elements are");
        for(int i=0;i<n;i++)
        System.out.println(array[i]);
        
    }
   

}
