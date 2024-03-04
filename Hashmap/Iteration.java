import java.util.*;

public class Iteration {
    public static void main(String arg[]){
        HashMap<String ,Integer> hm =new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("USA", 120);
        hm.put("USA", 80);  //It change value of US
        hm.put("Nepal", 20);  
        System.out.println(hm);
        Set<String > keys= hm.keySet();
        System.out.print(keys);
        for (String k : keys) {  //This is the syntax for a for-each loop. It iterates over each element in the keys set.
            System.out.print("keys"+k+"values="+hm.get(k));
        }
    }
}
