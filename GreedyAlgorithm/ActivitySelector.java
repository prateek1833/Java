//there is some problem in code
import java.util.*;
public class ActivitySelector {
    public static void main(String arg[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        ArrayList <Integer> a=new ArrayList<>();
        int maxAct=0;

        //First activity
        maxAct=1;
        a.add(0);
        

        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>lastend){
                maxAct++;
                a.add(i);
                lastend =end[i];
            }
        }

        for(int i=0;i<a.size();i++){
            System.out.println("A"+a.get(i));
        }
    }
    
}
