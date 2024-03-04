
import java.util.*;
public class sum{
public static void printHello(){
    System.out.println("Hello World");
}
public static int sum1(int num1, int num2){
    int sum=num1+num2;
    return sum;
}
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int add=sum1(a,b);
    System.out.print("add="+add);
    sc.close();
}
 
    
}
