import java.util.*;  //Given a number N.The task is to generate and print all binary numbers with decimal values from 1 to N.
public class Q1 {
    public static void Binary(int n){
        Queue <String> q=new LinkedList<>();
        q.add("1");
        while(n-->0){
            String s1=q.peek();
            q.remove();
            System.out.println(s1);
            String s2=s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
    public static void main(String args[]){
        System.out.println("Enter value of N");
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        Binary(N);
    }
    
}
