package DPandR;

public class regex {
  static   enum Result {
        TRUE, FALSE
    }

  static   Result[][] memo;

    public static boolean isMatch1(String text, String pattern) {
        memo = new Result[text.length() + 1][pattern.length() + 1];
        return dp(0, 0, text, pattern);
    }

    public static boolean dp(int i, int j, String text, String pattern) {
        if (memo[i][j] != null) {
            return memo[i][j] == Result.TRUE;
        }
        boolean ans;
        if (j == pattern.length()){
            ans = i == text.length();
        } else{
            boolean first_match = (i < text.length() &&
                    (pattern.charAt(j) == text.charAt(i) ||
                            pattern.charAt(j) == '.'));

            if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                ans = (dp(i, j+2, text, pattern) ||
                        first_match && dp(i+1, j, text, pattern));
            } else {
                ans = first_match && dp(i+1, j+1, text, pattern);
            }
        }
        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }
    public static boolean isMatch(String text, String pattern) {
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
    public static boolean ismat(String text,String p){
        if(p.isEmpty())return text.isEmpty();
        boolean fis=(!text.isEmpty()
        &&p.charAt(0)==text.charAt(0)||p.charAt(0)=='.'
        );

      if(p.length()>=2&&p.charAt(1)=='*'){
          boolean a=ismat(text,p.substring(2));
          boolean b=fis&&ismat(text.substring(1),p);
          return a||b;
        //  return (ismat(text,p.substring(2))||(fis&&ismat(text.substring(1),p)));
      }else {
          return fis&&ismat(text.substring(1),p.substring(1));
      }
    }

public static boolean check(String a,String b){
        if(a.isEmpty())return b.isEmpty();
        boolean c=a.charAt(0)==b.charAt(0);
        return c&&check(a.substring(1),b.substring(1));
}

    public static void main(String[] args) {
        String t="xaaabyc";
        String p="a*xa*b.c";
        String tt="";
        String pp="s*";
        System.out.println(ismat(t,p));
   ;
    }
}
