package hastable;

import java.util.*;

public class Unique {
    public static int sumOfUnique(int[] nums) {
Map<Integer, Integer>map=new HashMap<>();
int s=0;
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],nums[i]);
            }else if(map.containsKey(nums[i])){
                map.put(nums[i],0);
            }

        }
       for (Map.Entry entry:map.entrySet()){
           int k= (int) entry.getKey();
           int v= (int) entry.getValue();
           if(v!=0){
               s=s+v;
           }

       }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sumOfUnique(new  int[]{1,2,3,2}));
    }
}
