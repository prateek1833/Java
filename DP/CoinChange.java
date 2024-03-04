public class CoinChange {
    public static void change(int coin[],int sum){
        int n=coin.length;
        int dp[][]=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){  //sum=0 then i have 1 way(not to give anything)
            dp[i][0]=1;
        }
        //all the elements of dp[][] intialised with 0
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int c=coin[i-1];
                if(j>=c){
                    dp[i][j]=dp[i][j-c]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][sum]);
    }
    public static void main(String args[]){
        int coin[]={2,6,5,3};
        int sum=10;
        change(coin, sum);
    }
}
