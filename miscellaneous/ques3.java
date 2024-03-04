
import java.util.*;
public class ques3 {
    public static void main(String arg[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int fact=1;
        if(n>=0){
            if(n==0){
                System.out.print(1);
            }
            else{
                while(n!=1){
                    fact*=n;
                    n--;
                } 
                System.out.print("factorial is : "+fact);
            }
        }
        else{
            System.out.print("invalid number");
        }
        sc.close();
    }
}
