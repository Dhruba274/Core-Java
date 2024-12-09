package basic_programs.DSA;

import java.lang.reflect.Array;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Matching_elements {
    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 4, 5,6};
        Integer []B={4,7,8,1,2,9};
        Set<Integer>s1=new HashSet<Integer>();
        Set<Integer>s2=new HashSet<Integer>();
        Set<Integer>s3=new HashSet<Integer>();
        s1.addAll(Arrays.asList(A));
        //System.out.println(s1);
        s2.addAll(Arrays.asList(B));
        //s1.addAll(s2);
        //System.out.println(s1);
        s1.retainAll(s2);//This retainAll method checks if all the element is S2 is present is S1 so it returns the common elements
        System.out.println(s1);
       s1.removeAll(s2);//This will give the difference bwtween the two sets, it means it will print only the different values
       System.out.println(s1);
       
    }
    
}
