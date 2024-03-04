import java.util.*;
public class deque1 {
    public static void main(String arg[]){
        Deque <Integer> d=new LinkedList<>();
        d.addFirst(5);
        d.addFirst(4);
        d.addFirst(3);
        d.addLast(2);
        d.removeFirst();
        while(!d.isEmpty()){
            System.out.print(d.removeFirst());
        }
    }
    
}
