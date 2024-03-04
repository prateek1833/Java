import java.util.*;
public class MatrixMemo {
    public static int minCost(int arr[],int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=minCost(arr, i, k,dp);
            int cost2=minCost(arr, k+1, j,dp);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int FinalCost=cost1+cost2+cost3;
            ans=Math.min(FinalCost,ans);
        }
        return dp[i][j]=ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,3};
        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.print(minCost(arr, 1, 4,dp));
    }
}


