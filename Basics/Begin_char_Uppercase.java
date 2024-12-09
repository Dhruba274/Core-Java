import java.util.*;
public class Begin_char_Uppercase {
    public static void main(String[]args){
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String Upper_case=" ";
        String s = sc.nextLine();
        // System.out.println(s);
        Scanner st=new Scanner(s);
        while(st.hasNext()){//Returns true if this scanner has another token in its input. This method may block while waiting for input to scan. The scanner does not advance past any input.
            String word=st.next();//next() will only took the next token as input 
            Upper_case += Character.toUpperCase(word.charAt(0))+ word.substring(1)+" ";
        }
        System.out.println(Upper_case);
        
       
      
    }
    
}
