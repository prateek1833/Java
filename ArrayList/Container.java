import java.util.*;
public class Container {
    public static void Brute_Force(ArrayList<Integer> W ){
        int max=0;
        for(int i=0;i<W.size();i++){
            for(int j=i+1;j<W.size();j++){
                int width=j-i;
                int height=Math.min(W.get(j), W.get(i));
                if(max<height*width){
                    max=height*width;
                }
            }
        }
        System.out.print("Maximum Stored Water = "+max);
    }

     public static void pointer(ArrayList<Integer> W ){
        int max=0;
        int lp=0;
        int rp=W.size()-1;
        while(lp<rp){
            int width=rp-lp;
            int ht=Math.min(W.get(lp), W.get(rp));
            int water=width*ht;
            max=Math.max(max, water);
            if(W.get(lp)<W.get(rp)){
                lp++;
            }
            else rp--;
        }
        System.out.print("Maximum Stored Water = "+max);
     }

    public static void main(String arg[]){
        ArrayList <Integer> W=new ArrayList<>();
        W.add(1);
        W.add(8);
        W.add(6);
        W.add(2);
        W.add(5);
        W.add(4);
        W.add(8);
        W.add(3);
        W.add(7);
        pointer(W);
    }
    
    }
