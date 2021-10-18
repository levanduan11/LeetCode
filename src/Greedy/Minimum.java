package Greedy;

public class Minimum {

    public static int minOperations(int[] nums) {
        if(nums.length==0)return 0;
int cout=0;
int j=1;
int s=0;
        for (int i = 0; i < nums.length-1; i++) {
            cout=0;
          while (j<nums.length){
           if(nums[j]<=nums[i]){
               cout=nums[i]-nums[j]+1;
               nums[j]+=cout;
               s+=cout;

           }
             else if(nums[j]>nums[i]){

                  j++;
                  break;
              }
          }

        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(minOperations(new int[]{1,5,2,4,1}));
    }
}
