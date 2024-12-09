import java.text.SimpleDateFormat;
import java.util.*;
public class inputscanner {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("The number is "+num); 
        //First we need to clear the memory thern we have to take the input this is a big gamble every programmer made so be careful about this small things thank you let's get started
        System.out.println("Enter a string ");
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println("The string is "+str);
        //For character input we have to select sc.next().charAt(0);
        System.out.println("Enter a string to read a character ");
        char ch=sc.next().charAt(0);
        System.out.println("The charactor is "+ch);
        //formatted date
        SimpleDateFormat ft = new SimpleDateFormat("DD-MM-YYYY");
        String st =ft.format(new Date());
        System.out.println("Formatted date "+st);


    }
    
}
