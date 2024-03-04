import java.util.*;

public class LarIncArr {
    public static int arr(int a[], int b[]) {
        int dp[][] = new int[a.length + 1][b.length + 1];
        for (int i = 0; i < a.length + 1; i++) {
            for (int j = 0; j < b.length + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < a.length + 1; i++) {
            for (int j = 1; j < b.length + 1; j++) {
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[a.length][b.length];
    }

    public static int inc(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int b[] = new int[a.length];
        for (int ele : set) {
            b[j] = ele;
            j++;
        }
        Arrays.sort(b);
        return arr(a, b);
    }

    public static void main(String args[]) {
        int a[] = { 7, 7, 7, 7, 7, 7, 7 };
        System.out.print(inc(a));
    }
}
