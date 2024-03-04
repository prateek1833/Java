import java.util.*;

public class SetIterator {
    public static void main(String arg[]){
        HashSet <String > cities=new HashSet<>();
        cities.add("Basti");
        cities.add("Patna");
        cities.add("Gorakhpur");
        cities.add("Lucknow");
        // Iterator it= cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        for (String city : cities) {    
            System.out.println(city); 
        }
        
        LinkedHashSet <String > lhs=new LinkedHashSet<>();  // same as HashSet, also have property of order
        lhs.add("Basti");
        lhs.add("Patna");
        lhs.add("Gorakhpur");
        lhs.add("Lucknow");
        

        TreeSet <String > ths =new TreeSet<>();  //  sorted in ascending order
        ths.add("Basti");
        ths.add("Patna");
        ths.add("Gorakhpur");
        ths.add("Lucknow");

        System.out.println(cities);
        System.out.println(lhs);
        System.out.println(ths);
        
    }
    
}
