public class WildCardMatching {
    public static boolean Wild(String s, String p){
        int m=s.length();
        int n=p.length();
        boolean dp[][]=new boolean[m+1][n+1];
        dp[0][0]=true;
        for(int i=1;i<m+1;i++){
            dp[i][0]=false;
        }
        for(int j=1;j<n+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String args[]){
        String p="*****ba*****ab";
        String s="baaabab";
        System.out.print(Wild(s, p));
    }
}
