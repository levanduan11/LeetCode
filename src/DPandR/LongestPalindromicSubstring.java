package DPandR;

public class LongestPalindromicSubstring {
    public int longestPalindromeDynamic(char []str){
        boolean T[][] = new boolean[str.length][str.length];

        for(int i=0; i < T.length; i++){
            T[i][i] = true;
        }

        int max = 1;
        for(int l = 2; l <= str.length; l++){
            int len = 0;
            for(int i=0; i < str.length-l+1; i++){
                int j = i + l-1;
                len = 0;
                if(l == 2){
                    if(str[i] == str[j]){
                        T[i][j] = true;
                        len = 2;
                    }
                }else{
                    if(str[i] == str[j] && T[i+1][j-1]){
                        T[i][j] = true;
                        len = j -i + 1;
                    }
                }
                if(len > max){
                    max = len;
                }
            }
        }
        return max;
    }
    public static int longestPalindromeDynamic(String s){
        boolean t[][]=new boolean[s.length()][s.length()];

        int max=1;
        for (int i = 0; i < s.length(); i++) {
            t[i][i]=true;
        }
        for (int l = 2; l <=s.length() ; l++) {
            int ll=0;
            for (int i = 0; i < s.length()-l+1; i++) {
                ll=0;
                int j=i+l-1;
                if(l==2){
                    if(s.charAt(i)==s.charAt(j)){
                        t[i][j]=true;
                        ll=2;
                    }
                }else {
                    if(s.charAt(i)==s.charAt(j)&&t[i+1][j-1]){
                        t[i][j]=true;
                            ll=j-i+1;
                    }
                }
                if(ll>max)max=ll;
            }
        }
        return max;
    }
    public static String longerpalisb(String s){
        int long_s=1;
        int st=0;
        int end=0;
        String ss="";

        for (int i = 0; i < s.length(); i++) {
            int x,y;
            int pali;
            x=i;
            y=i+1;
            pali=0;
            while (x>=0&&y<s.length()&&s.charAt(x)==s.charAt(y)){
                x--;
                y++;
                pali+=2;
            }
           if(long_s<pali){
               long_s=pali;
               st=x+1;
               end=y;
           }
            x=i-1;
            y=i+1;
            pali=1;
            while (x>=0&&y<s.length()&&s.charAt(x)==s.charAt(y)){
                x--;
                y++;
                pali+=2;
            }
           if(long_s<pali){
               long_s=pali;
               st=x+1;
               end=y;
           }
           else if(long_s==1){
               st=x;
               end=x+long_s;
           }

        }
        if(s.length()==1)
            return s.substring(s.length()-1);

        return s.substring(st,end);
    }
    static int lps(String s){
        int n=s.length();
        int t[][]=new int[n][n];
        for (int i = 0; i < s.length(); i++) {
            t[i][i]=1;
        }
        for (int i = 2; i <=s.length() ; i++) {
            for (int j = 0; j < s.length()-i+1; j++) {
                int l=j+i-1;
                if(i==2&&s.charAt(j)==s.charAt(l))
                    t[j][l]=2;
                else if(s.charAt(j)==s.charAt(l))
                    t[j][l]=t[j+1][l-1]+2;
                else
                    t[j][l]=Math.max(t[j+1][l],t[j][l-1]);
            }
        }
        return t[0][s.length()-1];
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {

       String s="abaxaba";
        System.out.println(longestPalindrome(s));
    }

}
