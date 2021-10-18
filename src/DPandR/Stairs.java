package DPandR;

public class Stairs {
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 1]+ cost[i], dp[i - 2] + cost[i]);
        }
        return Math.min(dp[len - 1], dp[len - 2]);
    }

    public static void main(String[] args) {
int arr[]={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(arr));
    }
}
