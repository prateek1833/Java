import java.util.*;
public class MultiDimArray {
    public static void main(String arg[]){
        ArrayList<ArrayList<Integer>> AL=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        AL.add(list1);
        AL.add(list2);
        AL.add(list3);

        System.out.print(AL);
    }
    
}
