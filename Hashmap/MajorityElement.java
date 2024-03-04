import java.util.*;
public class MajorityElement {
    public static void main(String arg[]){
        HashMap <Integer,Integer> hm=new HashMap<>();
        int a[]={1,2,3,1,1,2,1,2,1,4,5};
        for(int i=0;i<a.length;i++){
            /*  if(hm.containsKey(a[i])){
                 hm.put(a[i],hm.get(a[i])+1);
             }
             else {
                 hm.put(a[i], 1);
             }*/
             hm.put(a[i],hm.getOrDefault(a[i], 0)+1);
        }
        Set<Integer> keySet= hm.keySet();//hm.keySet() returns a set of all the keys in the HashMap hm.
        for (Integer key : keySet) {
            if(hm.get(key)>a.length/3){
                System.out.print(key);
            }
        }
    }
}
