package array;

public class Altitude {
    public static int largestAltitude(int[] gain) {
int max=Integer.MIN_VALUE;
int dp[]=new int[gain.length+1];
int dex=0;
        for (int i = 1; i <gain.length ; i++) {
            gain[i]=gain[i-1]+gain[i];
        }
        for (int i = 1; i <dp.length ; i++) {
            dp[i]=gain[dex++];
        }
        for (int i = 0; i < dp.length; i++) {
            max=Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
int arr[]={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
