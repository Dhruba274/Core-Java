package basic_programs.DSA;
import java.util.Scanner;
import java.util.HashMap;
public class Max_occur {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt(); 
        int arr[] =new int [n];
       System.out.println("Enter the elements");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       } 
       HashMap<Integer,Integer> map=new HashMap<>();
      for(int ele : arr){
        map.put(ele, map.getOrDefault(ele, 0)+1);  

      }
        int countEle=arr[0];
        int countMax=0;
        for(int ele : map.keySet()){
            int count=map.get(ele);
            if(count > countMax){
                countMax=count;
                countEle=ele;
        
            }
    }
    System.out.println("Element with max occurrences: " + countEle);
        System.out.println("Max occurrences: " + countMax);
        int pn;
        String l;
        
}


}
