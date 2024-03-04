import java.util.*;
public class UnboundKnapsack {
    public static int Unbound(int val[], int wt[], int W) {
        int dp[][] = new int[val.length + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v=val[i-1];
                int w=wt[i-1];
                if (w <= j) {
                    int ans1 = v + dp[i][j -w];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[val.length][W];

    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W=7;
        System.out.println(Unbound(val, wt, W));
    }

}

