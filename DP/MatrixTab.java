public class MatrixTab {
    public static int minCost(int a[]){
        int dp[][]=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            dp[i][i]=0;
        }
        for(int len=2;len<=a.length-1;len++){
            for(int i=1;i<=a.length-len;i++){
                int j=len+i-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int cost1=dp[i][k];   
                    int cost2=dp[k+1][j];
                    int cost3=a[i-1]*a[k]*a[j];
                    dp[i][j]=Math.min(dp[i][j],cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp[1][a.length-1];
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int a[]={1,2,3,4,3};
        System.out.print(minCost(a));
    }
}
