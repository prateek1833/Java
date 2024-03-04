import java.util.*;
public class ChocolaProblem {

    public static void main(String arg[]){
        Integer hor[]={2,1,4,1,3};
        Integer ver[]={1,4,2};
        int h=0,v=0,cost=0;
        int hp=1,vp=1;

        Arrays.sort(hor,Collections.reverseOrder());
        Arrays.sort(ver,Collections.reverseOrder());

        while(h<hor.length && v<ver.length){
            if(hor[h]<ver[v]){
                cost+=ver[v]*hp;
                vp++;
                v++;
            }
            else{
                cost+=hor[h]*vp;
                hp++;
                h++;
            }
        }
        while(h<hor.length){
            cost+=hor[h]*vp;
            hp++;
            h++;
        }
        while(v<ver.length){
          cost+=ver[v]*hp;
          vp++;  
          v++;
        }
        System.out.print("cost of cut= "+cost);
    }
    
}
