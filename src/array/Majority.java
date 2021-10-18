package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Majority {
    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    private static int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an array of size 1 is the majority
        // element.
        if (lo == hi) {
            return nums[lo];
        }

        // recurse on left and right halves of this slice.
        int mid = (hi-lo)/2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement799(int[] nums) {
        return majorityElementRec(nums, 0, nums.length-1);
    }
    public static int majorityElement78(int[] nums){
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==0)return 0;
        int c;
        int max=1;
        for (int i = 0; i < nums.length-1; i++) {
       c=1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j])c++;
            }
            max=Math.max(max,c);
        }
        return nums[max-1];
    }
    public static int majorityElement7(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;
    }
    public static int majorityElement5(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    private static Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }
    public static int majorityElement3(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
    public static int majorityElement2(int[] nums){
    int n=nums.length;
    if(n==1)return nums[0];
    if(n==0)return 0;

        int s=0;
        int e=0;
        int max=1;
        int a;
        Arrays.sort(nums);
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]==nums[i-1]){
                e++;
                max=Math.max(max,e+1);
            }else {
                e=0;
            }





        }
        return nums[max];
    }
    public static int majorityElement1(int[] nums){
        Map<Integer, Integer>map=new HashMap<>();
        int max=0;

        for (int i = 0; i < nums.length; i++) {
          if(map.containsKey(nums[i])){
              int a=map.get(nums[i]);
              a=a+1;
              map.replace(nums[i],a);
          }
        else {
            map.put(nums[i],1);
          }
        max=Math.max(max,map.get(nums[i]));

        }

        for (Map.Entry t:map.entrySet()
             ) {
           int v= (int) t.getValue();
            if(v==max){
                return (int) t.getKey();
            }

        }
return 0;
    }
    public static int majorityElement(int[] nums) {
int cout[]=new int[1000000];
int max=0;
int index=0;
        for (int i = 0; i < nums.length; i++) {
            cout[nums[i]]++;
        }
        for (int i = 0; i < cout.length; i++) {

            if(max<cout[i]){
                max=cout[i];
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={2,2,3,3,3,3,4};
        System.out.println(majorityElement799(arr));
    }

}
