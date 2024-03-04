import java.util.*;
public class NearByCar {

    public static class points implements Comparable<points>{
        int x;
        int y;
        int i;
        int disSqr;
        public points(int x,int y,int i){
            this.x=x;
            this.y=y;
            this.i=i;
            this.disSqr=(x*x+y*y);
        }
        @Override
        public int compareTo(points p2){
            return this.disSqr-p2.disSqr;
        }
    }

    public static void main(String arg[]){
        int a[][]={{3,3},{-3,1},{2,0}};
        int i;
        int k=2;
        PriorityQueue<points> p=new PriorityQueue<>();
        for (i=0;i<a.length;i++){
            p.add(new points(a[i][0],a[i][1],i));
        }
        for (i=0;i<k;i++){
            System.out.println("C"+p.remove().i);
        }


    }
    
}
