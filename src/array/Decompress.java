package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Decompress {
    public static int[] decompressRLElist2(int[] nums) {

        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i <nums.length ; i+=2) {
            int j=i+1;
            for(;nums[i]>0;){
                list.add(nums[j]);
                nums[i]--;
            }
        }
       int res[]=new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=list.get(i);
        }
        return res;
    }

    public static int[] decompressRLElist(int[] nums) {

ArrayList<Integer>list=new ArrayList<>();
int n=nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <nums[i-1] ; j++) {
                list.add(nums[i]);
            }
            i++;
        }
        int res[]=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int res[]=decompressRLElist(arr);
    }
}
