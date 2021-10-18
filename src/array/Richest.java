package array;

import java.util.HashMap;
import java.util.Map;

public class Richest {
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer>m=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
if(m.containsKey(nums[i])){
  m.put(nums[i],m.get(nums[i])+1);
}
else {
    m.put(nums[i],1);
}
        }
        int cou=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j])cou++;
            }
        }
        return cou;
    }
    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int s;
        for (int i = 0; i < accounts.length; i++) {
            s=0;
            for (int j = 0; j < accounts[0].length; j++) {
                s+=accounts[i][j];
            }
            max=Math.max(max,s);
        }
        return  max;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
