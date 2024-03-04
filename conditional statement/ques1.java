import java.util.*;
public class ques1 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.print("Positive\n");
        }
        else if(a==0){
            System.out.print("Zero\n");
        }
        else{
            System.out.print("Negative\n");
        }
        sc.close();
    }  
}
