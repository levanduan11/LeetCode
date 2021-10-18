package array;

public class Sum {
    public static int[] runningSum(int[] nums) {
        int res[]=new int[nums.length];
res[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            res[i]=nums[i]+res[i-1];
        }
        return res;
    }
    static int[]s(int arr[]){
        int res[]=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                res[i]+=arr[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int res[]=runningSum(arr);

    }
}
