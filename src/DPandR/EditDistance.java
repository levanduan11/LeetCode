package DPandR;

public class EditDistance {
    public static int minDistance(String word1, String word2) {

        if(word1 == null || word2 == null){
            throw new IllegalArgumentException("Invalid Input");
        }
        if(word1.length() == 0) return word2.length();
        if(word2.length() == 0) return word1.length();


        int n=word1.length();
        int m=word2.length();
int dp[][]=new int[n+1][m+1];
        for (int i = 0; i <dp[0].length ; i++) {
            dp[0][i]=i;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=m ; j++) {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
            }

        }
        return dp[n][m];
    }


    public static void main(String[] args) {
        String s="intention";
        String s1="execution";
        System.out.println(minDistance(s,s1));
    }

}
