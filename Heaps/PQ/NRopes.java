import java.util.*;
public class NRopes {
    public static void main(String arg[]){
        PriorityQueue<Integer> q=new PriorityQueue<>();
        int a[]={4,3,6,2};
        for(int i=0;i<a.length;i++){
            q.add(a[i]);
        }
        
        int Cost=0;
        while(q.size()>1){
            int min=q.remove();
            int min2=q.remove();
            Cost+=min+min2;
            q.add(min+min2);
        }
        System.out.print(Cost);
    }
    
}
