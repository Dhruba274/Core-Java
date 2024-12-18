package collection;
//import java.util.List;
import java.util.*;

public class Frame_w1 {
    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>();
        array.getClass();
        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
       // list.add("Dhruba");ṇot possoible as it is string datatype
        System.out.println(list);
        list.add(1,5);
        System.out.println(list);
        list.add(2,6);
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list.size());
        array.size();
        int []a=new int[1];
        String s="DG";
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i));

       }
        //LinkedList
        System.out.println("\n");
        List <Integer> Linked= new LinkedList<Integer>();
        Linked.add(1);
        Linked.add(0,4);
        Linked.add(2,5);
        System.out.println(Linked);
        Linked.remove(2);//Remove from index 
        System.out.println(Linked);
    
        //Vector
        Vector<Integer> vec=new Vector<Integer>();
        vec.add(3);
        vec.add(4);
        vec.add(5);
        System.out.println(vec);


        //Stack(Always last in first out)
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        /*
         * push()
         * pop()
         * peek()
         * This operations are done
         */

         //Set 
        //We dont know if it is sorted or not and unique
         Set<Integer> set=new HashSet<Integer>();
         set.add(1);
         set.add(6);
         set.add(0);
         set.add(3);
         set.add(8);
         set.add(2);

         System.out.println(set);

         //LinkedHAshSet
         //So it includes LinkedList,HasSet property So it's ordered and Sorted
         LinkedHashSet<Integer> set1=new LinkedHashSet();
         set1.add(1);
         set1.add(6);
         set1.add(0);
         set1.add(3);
         set1.add(8);
         set1.add(2);
        System.out.println(set1.contains(2)); 
         System.out.println(set1);
         

         //TreeSet 
         //It implement sorted,unique,order will change BinarySearch tree implemented
         TreeSet<Integer> tree= new TreeSet<Integer>();
         tree.add(1);
         tree.add(6);
         tree.add(0);
         tree.add(3);
         tree.add(8);
         tree.add(2);
         System.out.println(tree);
        //Queue
        Queue<Integer>queue=new LinkedList<Integer>();
        queue.add(1);
        queue.add(6);
        queue.offer(2);//It will add the element first in the order
        queue.offer(5);
        System.out.println("Queue= "+queue);
        System.out.println(queue.remove());
        System.out.println("Queue= "+queue);
        System.out.println(queue.poll());//This will only remove the first inserted element in the queue it will return true if elemnts are present
        System.out.println("Queue= "+queue);
        System.out.println(queue.peek());//It will give the first entered element in this case it is 2
        //Double ended queue implemented by arraydequeue
        //It's a queue which can be accessed from both ends
        //Deque
        Deque<Integer> deq =new ArrayDeque<Integer>();
        deq.offerFirst(1);
        deq.offerFirst(6);
        deq.offerFirst(0);
        deq.offerLast(3);
        deq.offerLast(8);
        System.out.println("Deque= "+deq);
        deq.pollLast();//Last element will be out
        System.out.println("Dequeue ="+deq);
        deq.pollFirst();//First element will be out
        System.out.println("Dequeue ="+deq);
        // String s="Dhruba";
        // System.out.println(s.indexOf("a"));
        //Priority Queue
        //It is a queue which will give the element in the order of priority
        PriorityQueue <Integer> pq= new PriorityQueue<Integer>();//Min Heap by default
        pq.add(12);
        pq.add(56);
        pq.add(4);
        pq.add(2);
        pq.add(6);
        pq.add(8);
        System.out.println("Peek is "+pq.peek());
        while (!pq.isEmpty()) {
            System.out.print(" "+pq.poll());//poll will remove and returns the top or head of the queue
        }
        
       
    }
   
}
