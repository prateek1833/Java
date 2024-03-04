public class MinPart {
    public static int Partition(int a[]) {
        int n = a.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int W=sum/2;
        int dp[][] = new int[n + 1][W + 1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                dp[0][j]=0;
                dp[i][0]=0;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(j>=a[i-1]){
                    int inc=a[i-1]+dp[i-1][j-a[i-1]];
                    int exc=dp[i-1][j];
                    dp[i][j]=Math.max(exc,inc);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int sum1=dp[n][W];
        int sum2=sum-sum1;
        return sum1-sum2;
        
    }

    public static void main(String args[]) {
        int a[] = { 1, 6, 11, 5 };
        System.out.print(Partition(a));
    }
}
