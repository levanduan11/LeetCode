package DPandR;

public class Climbing {
    static int da(int n){
        int dp[]=new int[n+1];
        if(n==1||n==2)return n;
     dp[1]=1;
     dp[2]=2;
        for (int i = 3; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(da(2));
    }
}
