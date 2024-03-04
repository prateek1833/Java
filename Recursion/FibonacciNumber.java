// package Recursion;

public class FibonacciNumber {  //nth fibonacci number
    public static int FN(int n) {
        
        if (n == 0 || n==1) {

            return n;
        } 
        int fnm1 = FN(n - 1);
        int fnm2 = FN(n - 2);
        return fnm1 + fnm2;
        
    }

    public static void main(String arg[]) {
        System.out.print(FN(25));
    }

}
