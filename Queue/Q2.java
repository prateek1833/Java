import java.util.*;
public class Q2 {
    public static int mincost(int a[],int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res=0;
        for(int i=0;i<n;i++){
            pq.add(a[i]);
        }
        while(pq.size()>1){
            int smaller=pq.poll();
            int small=pq.poll();
            res+=small+smaller;
            pq.add(small+smaller);
        }
        return res;
    }
    public static void main(String arg[]){
        int n=4;
        int a[]={4,2,3,6};
        System.out.print(mincost(a, n));
    }
}
