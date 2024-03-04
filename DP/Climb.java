import java.util.*;
public class Climb {
    public static int count(int n){
        if(n==1 || n==2){
            return n;
        }
        return count(n-1)+count(n-2);
    }
    public static int countMemo(int n,int dp[]){
        if(n==1 || n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]= count(n-1)+count(n-2);
        return dp[n];
    }
    public static void main(String arg[]){
        int n=46;
        // System.out.print(count(n));
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.print(countMemo(n,dp));
    }
    
}
