import java.util.PriorityQueue;

public class MaxSlideWind {
    static class pair implements Comparable <pair>{
        int value;
        int idx;
        public pair(int value,int idx){
            this.value=value;
            this.idx=idx;
        }
        @Override
        public int compareTo(pair p2){
            return p2.value-this.value; // descending
        }
    }
    public static void main(String arg[]){
        int a[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[a.length-k+1];
        PriorityQueue<pair> p=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            p.add(new pair(a[i], i));
        }
        res[0]=p.peek().value;
        for(int i=k;i<a.length;i++){
            while(p.size()>0 && p.peek().idx<=i-k){
                p.remove();
            }
            p.add(new pair(a[i], i));
            res[i-k+1]=p.peek().value;
        }
        for(int i=0;i<a.length-k+1;i++){
            System.out.println(res[i]);
        }
    }
}
