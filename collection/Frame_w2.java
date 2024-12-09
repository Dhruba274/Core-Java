package collection;
import java.lang.reflect.Array;
import java.util.*;
class Frame_w2{
    
    public static void main(String[] args) {
        //Map--->Hashmap,TreeMap,EnumMAp,LinkedHashMap,WeakHashMap
        HashMap<String, Integer> map = new HashMap<String, Integer>();//The hashmap is like key value pair object declaration
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("A", 1);
        map.put("B", 2);
        map.remove("A");
        map.get("B");
        
        map.getOrDefault("A",0);
        
        System.out.println(map);
        //TreeMap
        //It will sort in ascending order by checking the corresponding 
        TreeMap<String,Integer>Tmap=new TreeMap<String,Integer>();
        Tmap.put("C", 3);
        Tmap.put("D", 4);
        Tmap.put("E", 5);
        //Tmap.put("A", 1);
        Tmap.put("B", 2);
        System.out.println("TreeMap is "+Tmap);
        System.out.println(Tmap.getOrDefault("A",9));//This will return the value of the corresponding key element
        System.out.println(Tmap.keySet());//It will give the key element
        System.out.println(Tmap.values());
        for (int i: Tmap.values()){
            
            System.out.println(i);

        }
        //Arrays Collection framework
        //int arr[]=new int[10];
        int arr[]={2,5,1,8,0,9,12,4};
       
        for(int i : arr){
            System.out.print(" "+i);
        }
        Arrays.sort(arr);
        System.out.println();
        // System.out.println("Sorted array is "+Arrays.toString(arr));
        
        for(int i : arr){
            System.out.print(" " +i);
        }
        System.out.println();
       System.out.println(Arrays.binarySearch(arr, 12)); //It will return the address of the particuylar key elemnt
       double a=Math.sqrt(8);
       double b=Math.floor(a);
       int i=(int)b;
       System.out.println( i);
        int ar[]=new int[4];
       
      
    }
}