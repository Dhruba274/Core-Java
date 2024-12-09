package collection;

import java.util.HashMap;

public class Map_class {
    public static void main(String[] args) {
        HashMap<String, String> president=new HashMap<String,String>(); 
        
        president.put("USA", "Joe Biden");
        president.put("India", "Narendra Modi");
        president.put("China", "Xi Jinping");
        System.out.println(president.get("USA"));
        System.out.println(president.getOrDefault("Swiss","1"));
       
    }

    

}
