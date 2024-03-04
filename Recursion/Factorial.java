// package Recursion;

public class Factorial {
    int fact=1;
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
       int fact=n*Fact(n-1);
       return fact;
    }
    public static void main(String arg[]){
        System.out.print(Fact(6));

    }
    
} // Time comlexity=O(n)
  // space comlexity=O(n)