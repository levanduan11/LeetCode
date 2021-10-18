package DPandR;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumArray {
int arr[];
    public NumArray(int[] nums) {
this.arr=nums;
    }

    public int sumRange(int left, int right) {
int sum=0;
        for (int i = left; i <right ; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
       Map<Map<Integer, Integer>,Integer>map=new HashMap<>();
       int arr[] ={-2, 0, 3, -5, 2, -1};
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr.length; j++) {
              sum+=arr[j];
              Map<Integer, Integer>m=new HashMap<>();
              m.put(i,j);
              map.put(m,sum);
            }
        }
    }

}
