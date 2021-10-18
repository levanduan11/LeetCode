package DPandR;

public class Matching {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for (int j = 1; j<=p.length(); j++){
            if(p.charAt(j-1) == '*' && dp[0][j-2]){
                dp[0][j] = true;
            }
        }
        for (int i = 1; i<=s.length(); i++){
            for (int j = 1; j<=p.length(); j++){
                if(p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '.'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    if(p.charAt(j-2) != s.charAt(i-1) && p.charAt(j-2)!='.'){
                        dp[i][j] = dp[i][j-2];
                    }
                    else{
                        dp[i][j] = (dp[i][j-2] || dp[i][j-1] || dp[i-1][j]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];

    }
    public static boolean isMatch2(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--){
            for (int j = pattern.length() - 1; j >= 0; j--){
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];
    }
    static boolean isMatch1(String s,String p){
        int i,j;
        int co=0;
        int max=0;
        boolean t[][]=new boolean[s.length()][p.length()];
        for ( i = 0; i < s.length(); i++) {
            for (j = 0; j < p.length(); j++) {
                if(s.charAt(i)==p.charAt(j))t[i][j]=true;
                if(p.charAt(j)=='*'){
                    for (int k = 0; k < j; k++) {
                        if(p.charAt(k)==s.charAt(i))t[i][j]=true;
                    }
                }
                if(p.charAt(j)=='.')t[i][j]=true;

            }

        }
//        for (int k = 0; k < s.length(); k++) {
//            for (int l = 0; l < p.length(); l++) {
//                System.out.print("  "+t[k][l]);
//            }
//            System.out.println();
//
//        }
        for (int k = 0; k < s.length()&&k<p.length(); k++) {
            for (int l = 0; l < s.length()&&k<p.length(); l++) {
                co=0;
                for (int m = 0; m < s.length()&&k<p.length(); m++) {
                    if(t[k+m][k+l+m])co++;
                    if(co==s.length())return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s="aab";
        String p="c*a*b";
       // isMatch(s,p);
     System.out.println(isMatch2(s,p));

    }
}
