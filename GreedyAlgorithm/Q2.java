import java.util.*;

public class Q2 {
    public static void LargestOdd(int l, int r, int k) {
        int i;
        if(Math.max(r, l)%2==0){
             i=Math.max(r, l)-1;
            while(k-->1){
                i=i-2;
            }
        }
        else{
             i=Math.max(r, l);
            while(k-->1){
                i=i-2;
            }
        }
        if(i<Math.max(l, r) && i>Math.min(l, r)){
        System.out.print(i);
        }
        else{
            System.out.print("Not Exist");
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Element :");
        int l = sc.nextInt();
        System.out.print("Enter second Element :");
        int r = sc.nextInt();
        System.out.print("Enter Kth Element :");
        int k = sc.nextInt();
        LargestOdd(l, r, k);
    }

}
