import java.util.*;
public class ChainPairs {
    public static void main(String arg[]){
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays .sort(pair,Comparator.comparingDouble(o->o[1]));
        int count=1;
        int end=pair[0][1];
        for(int i=0;i<pair.length;i++){
            if(pair[i][0]>=end){
                count++;
                end=pair[i][1];
            }
        }
        System.out.print("longest chain will be of length "+ count);
    }
    
}
