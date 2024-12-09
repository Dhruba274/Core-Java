import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        int choice;
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice){
            case 1: 
                int sum=a+b;
                System.out.println("The addition of two number is "+sum);
                break;
            case 2: 
                int dif=a-b;
                System.out.println("The subtraction of two number is "+dif);
                break;
            case 3: 
                int mul=a*b;
                System.out.println("The multiplication of two number is "+mul);
                break;
            case 4: 
                int div=a/b;
                System.out.println("The division of two number is "+div);
                break;
            default:
                System.out.println("Enter valid choice");
            
        }
        
    }
    
}
