public class LarSeqMem {

    public static int LongestSequence(String str1, String str2, int m, int n,int dp[][]) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        else if (str1.charAt(m - 1) != str2.charAt(n - 1)) {
            int s1 = LongestSequence(str1, str2, m - 1, n,dp);
            int s2 = LongestSequence(str1, str2, m, n - 1,dp);
            return dp[m][n]=Math.max(s1, s2);
        } else {
            return dp[m][n]=LongestSequence(str1, str2, m - 1, n - 1,dp) + 1;
        }
    }

    public static void main(String args[]) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(LongestSequence(str1, str2, str1.length(), str2.length(),dp));
    }

}
