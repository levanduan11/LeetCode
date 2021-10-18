package array;

import java.util.Arrays;

public class Smaller {
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int res[]=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j])
                    res[i]++;
            }
        }
        return res;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int res[]=new int[nums.length];

        int cout=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >=0; j--) {
                if(nums[i]>nums[j]){
                    cout++;
                }
                    res[i]=cout;



            }
            cout=0;
        }
        return res;
    }

    public static void main(String[] args) {
int arr[]={6,5,4,8};
int res[] =smallerNumbersThanCurrent1(arr);
        for (int k:res
             ) {
            System.out.println(k);
        }
    }
}
