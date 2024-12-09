package collection;

import java.util.*;
class MycustomComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1,Animal o2){
        return o1.weight-o2.weight;
    }
}
public class Comparetor_compareable {
    public static void main(String[] args) {
        Animal A1=new Animal(10, "Leo", 50);
        Animal A2=new Animal(20, "Tom", 60);
        Animal A3=new Animal(15, "Tigro", 40);
        Animal A4=new Animal(12, "Foxa", 60);
       
        
        List<Animal>d=new ArrayList<Animal>();
        d.add(A1);
        d.add(A2);
        d.add(A3);
        d.add(A4);
        System.out.println(d);
        

      d.sort(null);
      Collections.sort(d,new MycustomComparator()); //I can create my own comparator class
      //Collections.sort(d);
      System.out.println(d);
    }
    
    
}
