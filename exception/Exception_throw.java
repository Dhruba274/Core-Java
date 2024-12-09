package exception;

import java.util.Scanner;

public class Exception_throw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        try{
            if(num<0){
                throw new Myexception("Exception!! Nummber should be positive");
                // System.out.println("Exception!!! The number should be positive");
                // throw new ArithmeticException("The number should be positive ");
                // //We can also include the inbuild exception
                
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
//
class Myexception extends Exception{
   //Here we can easily build our own exception class which can throw exception
   public Myexception(String msg){
    //There is a constructor which can pass any message according to recommendation
    super(msg);//This super key word will call the constructor of parent
    }
}
