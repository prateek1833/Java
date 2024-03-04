import java.util.*;
public class primenumber {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if(n==2){
            System.out.print("Prime Number");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.print("Prime Number");
            }
            else
            System.out.print("Not prime Number");
        }
        sc.close();
    }
    
}
