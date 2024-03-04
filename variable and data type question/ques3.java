import java.util.*;

public class ques3{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost of 3 items\n");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float price = (a+b+c);
        float gst=((a+b+c)*(.18f));
        float total = (price+gst);
        System.out.println("price is : "+price);
        System.out.println("gst : "+gst);
        System.out.println("total price : "+total);
        sc.close();
    }
}
