package DPandR;

public class Vowel {
    public static int s(int n){
        if(n==0)return 1;
        int c=0;
        for (int i = 0; i < 3; i++) {
            c+=s(n-1);
        }
        return c;
    }
    public static int countVowelStrings(int n) {
        int dp[] = new int[5];
        for(int i = 0 ; i < 5 ; i++) dp[i] = 1;

        for(int i = 1; i <= n ; i++) {
            for(int j = 1 ; j < 5 ; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[4];
    }


    public static void main(String[] args) {
        System.out.println(countVowelStrings(3));
        System.out.println(s(3));
    }
}



