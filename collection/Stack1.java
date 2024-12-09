package collection;

import java.util.Stack;

public class Stack1
 {
    public static void main(String[] args) {
        Stack<String> fruit=new Stack<String>();
        fruit.push("Apple");
        fruit.push("Banana");
        fruit.push("Cherry");
        fruit.push("Date");
        fruit.push("Elderberry");
        fruit.pop();
        System.out.println("Stack: "+fruit);
    }
}
