import java.util.*;
public class q1 { //To add,subtract,multiply two complex number
    public static void main(String[] arg){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        operation o=new operation();
        // o.addition(a, b, c, d);
        // o.subtraction(a, b, c, d);
        o.product(a, b, c, d);
    }    
}
class operation{
    void addition(int a,int b,int c,int d){
        System.out.print("("+a+"+"+b+"i"+")+"+"("+c+"+"+(d)+"i"+")"+"= ");
        System.out.print((a+c)+"+"+(b+d)+"i");
    }
    void subtraction(int a,int b,int c,int d){
        System.out.print("("+a+"+"+b+"i"+")-"+"("+c+"+"+d+"i"+")"+"= ");
        System.out.print((a-c)+"+"+(b-d)+"i");
    }
    void product(int a,int b,int c,int d){
        System.out.print("("+a+"+"+b+"i"+")*"+"("+c+"+"+d+"i"+")"+"= ");
        System.out.print(a*c-b*d);
    }
} 

