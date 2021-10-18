package lesso2;

import java.util.Arrays;

public class Third {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1||nums.length==2)
            return nums[nums.length-1];

        int count =1;
        int i=nums.length-1;
        int max=nums[i];

        while(i>=1&&count<3)
        {
            if(nums[i-1]<max)
            {
                max=nums[i-1];
                count++;
            }
            i--;
        }
        if(count!=3) return nums[nums.length-1];

        return max;
    }

    public static void main(String[] args) {
int a[]={4,5,6};
        System.out.println(thirdMax(a));
    }
}
