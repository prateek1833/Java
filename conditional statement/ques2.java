import java.util.*;
public class ques2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp>100){
            System.out.println("U have fever");
        }
        else{
            System.out.println("U have not fever");
        }
        sc.close();
    }
}
