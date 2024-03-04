import java.util.*;
public class FractionKnapsnack {
    public static void main(String arg[]){;
        int value[]={60,120,100};
        int weight[]={10,30,20};
        int W=50;
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=W,FinalVal=0;
        for(int i=value.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                FinalVal+=value[idx];
                capacity-=weight[idx];
            }
            else{
                FinalVal+=ratio[i][1]*capacity;
            }
        }
        System.out.print(FinalVal);
    }
}
