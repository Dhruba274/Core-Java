import java.util.Scanner;

public class Gcd {
    static int gcd(int a ,int b){
        Math.min(a, b);
        if (b == 0)
        return a;
        if (a==0)
        return b;
        if(a==b)
        return a;
        if(a>b)
        return gcd(a-b,b);
        else 
        return gcd(a,b-a); 

    }
   
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner sc =new Scanner (System.in);
        int a ,b;
        a=sc.nextInt();
        b=sc.nextInt();
       Solution s=new Solution();
       int sol= Solution.gcd(a, b);//As the gcd method is static we haven't create any object
       System.out.println("The gcd of "+a+" and "+ b+" is " +sol);
      // System.out.println("The gcd of "+a +" and "+b+" is "+gcd(a,b));
    }
}
class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return  a;
        } else {
            return gcd(b, a%b);
        }
    }
}
// import java.io.*;

// public class Gcd {

//
//     static int gcd(int a, int b)
//     {
//        
//         int result = Math.min(a, b);
//         while (result > 0) {
//             if (a % result == 0 && b % result == 0) {
//                 break;
//             }
//             result--;
//         }

//        
//         return result;
//     }

//    
//    public static void main(String[] args) {
//     System.out.println("Enter two number");
//     Scanner sc =new Scanner (System.in);
//     int a ,b;
//     a=sc.nextInt();
//     b=sc.nextInt();
//     System.out.println("The gcd of "+a +" and "+b+" is "+gcd(a,b));
// }
// }
