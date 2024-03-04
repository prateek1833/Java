import java.util.*;
public class Q3 {
    public static void maxfrq(ArrayList <Integer> A,int key){
        int result[]=new int[1000];
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)==key){
                result[(A.get(i+1))]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<1000;i++){
            if(max<result[i]){
                max=result[i];
                ans=i;
            }
        }
        System.out.print(ans+" "+max);
    }  
    public static void main(String arg[]) {
        ArrayList <Integer> A=new ArrayList<>();
        A.add(1);
        A.add(100);
        A.add(1);
        A.add(5);
        A.add(1);
        A.add(100);
        A.add(1);
        A.add(100);
        A.add(1);
        A.add(5);
        A.add(1);
        A.add(100);
        maxfrq(A, 1);
    }
}
