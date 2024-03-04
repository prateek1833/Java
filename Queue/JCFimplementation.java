import java.util.*;

public class JCFimplementation {

    public static void main(String arg[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(5);
        q.add(4);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
