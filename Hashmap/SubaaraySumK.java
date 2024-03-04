import java.util.*;

public class SubaaraySumK {
    public static void main(String arg[]){
        int a[]={3,10,2,-2,-20,10};
        int k=-10;
        int sum=0,n=0,m=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(map.containsKey(sum-k)){
                n=i;
                m=map.get(sum-k);
                System.out.println("["+(m+1)+","+n+"]");
            }
            else{
                map.put(sum, i);
            }
        }
    }

}
