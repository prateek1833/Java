import java.util.HashMap;

public class operation {
    public static void main(String arg[]){
        HashMap<String ,Integer> hm =new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("USA", 120);
        hm.put("USA", 80);  //It change value of US
        hm.put("Nepal", 20);  
        System.out.println(hm);
        hm.remove("Nepal");   // On removing only key is needed
        System.out.println(hm);
        System.out.println(hm.containsKey("India"));     // it tell about hashMap contains key or not
        System.out.println(hm.get("India"));   // it gives the value of key
        hm.clear();           //Uses to clear the list
        System.out.println(hm.isEmpty());
    }
}
