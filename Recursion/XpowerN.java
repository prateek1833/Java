public class XpowerN { // to find x^n using recursion
    public static int power(int x,int n){
        if(n==1) return x;
        return x*power(x,(n-1));
    } //Time Complexity O(n)
    public static int power1(int x,int n){  // to find x^n using recursion (optimised)
        if(n==0) return 1;
        if(n%2==0){
        return power(x,n/2)*power(x,n/2);
        }
        else
        {
            return x*power(x,n/2)*power(x,n/2);
        }
    } //Time Complexity O(logn)
    public static void main(String arg[]){
        System.out.print(power1(8,4));
    }
}
