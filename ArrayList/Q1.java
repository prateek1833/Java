import java.util.ArrayList;
public class Q1 {
    public static boolean monotonic(ArrayList <Integer> A){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)>A.get(i+1))
            inc =false;
            if(A.get(i)<A.get(i+1))
            dec =false;
        }
        return inc|| dec;
    }
    public static void main(String arg[]){
        ArrayList <Integer> A=new ArrayList <>();
        A.add(3);
        A.add(4);
        A.add(6);
        A.add(8);
        A.add(9);
        A.add(11);
        System.out.print(monotonic(A));
    }
    
}
