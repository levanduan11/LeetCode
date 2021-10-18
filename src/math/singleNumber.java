package math;

import java.util.HashMap;
import java.util.Map;

public class singleNumber {
    public static int singleNumber(int[] nums) {
        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            max=Math.max(max,nums[i]);
        }
     int cou[]=new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            cou[nums[i]]++;
        }
        for (int i = 0; i < cou.length; i++) {
            if(cou[i]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int aarr[]={-1};
        System.out.println(singleNumber(aarr));
    }
}
