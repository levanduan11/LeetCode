package array;

import java.util.ArrayList;

public class Create {
    public static int[] createTargetArray1(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        for(int i = 0; i < index.length; i++) {
            int idx = index[i]; int val = result[idx];
            while(idx < index.length-1 && val!= 0) {
                int temp = result[idx+1];
                result[++idx] = val;
                val = temp;
            }
            result[index[i]] = nums[i];
        }
        return result;
    }
    public static int[]co(int arr[],int index,int x){
        int n=arr.length;
        int newarr[]=new int[n+1];
        newarr[index]=x;
        for (int i = 0; i < index; i++) {
            newarr[i]=arr[i];
        }
        for (int i = index+1; i <newarr.length ; i++) {
            newarr[i]=arr[index++];
        }
        return newarr;
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
int res[]=new int[nums.length];
ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < res.length; i++) {
            res[i]=list.get(i);
        }


return res;
    }

    public static void main(String[] args) {
        int n[]={0,1,2,3,4};
        int arrr[]={0,1,2,2,1};
        System.out.println(createTargetArray1(n,arrr));
        int arr[]=co(arrr,4,100);
        for (int a:arr
             ) {
            System.out.println(a);
        }
        System.out.println(co(arrr,4,100));

    }
}
