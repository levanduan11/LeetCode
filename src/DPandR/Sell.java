package DPandR;

public class Sell {
    public static int maxProfit(int[] prices) {
int max=0;
        int d=prices.length-1;
        int  pos=prices[d];
        for (int i = prices.length-2; i >=0 ; i--) {

            if(prices[i]<pos){
                max=Math.max(max,pos-prices[i]);
            }else {
pos=prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
int arr[]={};
        System.out.println(maxProfit(arr));
    }
}
