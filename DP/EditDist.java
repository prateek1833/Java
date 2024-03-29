import java.util.*;
public class EditDist {
    public static int distance(String a, String b) {
        int m = a.length();
        int n = b.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int add=dp[i][j-1];
                    int remove=dp[i-1][j];
                    int replace=dp[i-1][j-1];
                    dp[i][j]=Math.min(add,Math.min(remove,replace))+1;
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String args[]) {
        String a = "intention";
        String b = "execution";
        System.out.print(distance(a, b));
    }
}
