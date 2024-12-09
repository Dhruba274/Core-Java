package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_class {
    public static void main(String[] args) {
        Queue<Integer>q1=new LinkedList <Integer>();
        q1.offer(2); 
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);
        System.out.println("Queue elements: "+q1);
    }
    
}
