// package Recursion;

public class SumofNatural {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        int s=n + Sum(n-1);
        return s;
    }
    public static void main(String[] arg){
        int p=4;
        System.out.print(Sum(p));
    }
}
