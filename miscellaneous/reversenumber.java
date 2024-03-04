import java.util.*;
public class reversenumber {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();
        int x=0;
        while(n!=0){
          x=(int)((x*10)+(n%10));  
          n=n/10;
        }
        System.out.print(x);
        sc.close();
    }
}
