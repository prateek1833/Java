package loops;
import java.util.*;

public class ques2 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int y=0;
        System.out.print("Enter the size of set");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            if(m%2==0)
            {
                x+=m;
            }
            else
            {
                y+=m;
            }
        }
        System.out.print("odd sum ="+y);
        System.out.print("even sum ="+x);
        sc.close();
    }
    
}
