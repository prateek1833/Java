import java.util.*;

public class MinArrJump {
    public static int Jump(int a[]) {
        int n = a.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int ans = Integer.MAX_VALUE;
            for (int j = i + 1; j <= (i + a[i]) && j < n; j++) {
                if (dp[j] != -1) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }
            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }
        print(dp);
        return dp[0];
    }

    public static void print(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 1, 1, 4 };
        System.out.print(Jump(arr));
    }
}
