import java.util.*;
public class catlan {
    public static int memoisation(int n,int dp[]){
        if(n==0||n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=memoisation(i, dp)*memoisation(n-i-1, dp);
        }
        return dp[n]=ans;
    }
    public static int Tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String arg[]){
        int n=4;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // System.out.print(memoisation(n, dp));
        System.out.print(Tabulation(n));
    }
}
