public class LarComSubStr {

    public static int LongestSequence(String str1, String str2, int m, int n, int dp[][]) {
        int ans=0;
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                ans=Math.max(dp[i][j],ans);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        String str1 = "abcdgerty";
        String str2 = "abcffedgerty";
        int dp[][] = new int[str1.length() + 1][str2.length() + 1];
        System.out.println(LongestSequence(str1, str2, str1.length(), str2.length(), dp));
    }

}
