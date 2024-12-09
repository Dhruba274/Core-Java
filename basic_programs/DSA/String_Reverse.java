package basic_programs.DSA;
import java.util.*;
public class String_Reverse {
    public static void main(String[] args) {
        String sb=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        sb=sc.nextLine();
        String rev="";
        int n=sb.length();
        for(int i=n;i>0;i--){
            rev=rev+sb.charAt(i-1);
        }
        System.out.println(rev);
    }
}
