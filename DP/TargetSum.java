import java.util.*;

public class TargetSum {

    public static boolean knapsackT(int num[], int Target) {
        boolean dp[][] = new boolean[num.length + 1][Target + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = num[i - 1];
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                } else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[num.length][Target];

    }

    public static void print(boolean dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int num[] = { 4, 2, 7, 1, 3 };
        int Target = 10;
        System.out.println(knapsackT(num, Target));
    }

}
