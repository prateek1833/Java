import java.util.*;

public class hs {
    public static void main(String arg[]){
        HashSet<Integer> HS=new HashSet<>();
        HS.add(5);
        HS.add(8);
        HS.add(4);
        HS.add(6);
        HS.add(7);
        HS.add(5);
        HS.remove(6);
        System.out.print(HS);

       
    }
    
}
