package DPandR;

public class Wildcard {
    public static boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
boolean dp[][]=new boolean[m+1][n+1];
dp[0][0]=true;
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];

                }

                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];

                }


                else {
                    dp[i][j]=false;
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s="adceb";
        String p="*a*b";
        System.out.println(isMatch(s,p));

    }
}