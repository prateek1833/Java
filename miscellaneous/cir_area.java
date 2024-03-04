
import java.util.*;
public class cir_area {
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        float rad = sc.nextFloat();
        float area = (22/7)*rad*rad;
        System.out.print("area :");
        System.out.print(area);
        sc.close();
    }
}
