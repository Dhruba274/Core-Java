package collection;
import java.util.List;
import java.util.ArrayList;

public class Learn_frame {
    public static void main(String[] args) {
    List <Integer>list=new ArrayList<Integer>();
    List <Integer> list2= new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list2.add(3);
    list2.add(4);
    //The add will add in the end always
    //list.remove(1);
    list.addAll(list2);
    list.removeAll(list2);//Removes from this list all of its elements that are contained in the specified
    //list.remove(Integer.valueOf(1));
    //list.retainAll(list2);//Retains only the elements in this list that are contained in the specified collection
    System.out.println(list.contains(1));
    System.out.println(list);
    String s="Dhruba";
    char []ch=s.toCharArray();
    try{
    list.subList(1,2);
    }
    catch(IndexOutOfBoundsException e){
            System.out.println("Please access from the size of the array");
    }
    System.out.println("Dhhrua");
    }
}
