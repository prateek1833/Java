// package Recursion;

public class NaturalNumb {   //Print n numbers in decreasing order
    public static void PD(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        PD(n-1);
    }
    public static void PI(int n){  // Print n numbers in increasing order
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PI(n-1);
        System.out.print(n+" ");
    }
    
    public static void main(String arg[]){
        int n=100;
        // PD(n);
        PI(n);
    }
    
}
