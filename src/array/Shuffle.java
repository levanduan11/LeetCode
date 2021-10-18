package array;

import java.util.LinkedList;
import java.util.Queue;

public class Shuffle {
    public static int[] shuffle1(int[] nums, int n) {
        int res[]=new int[nums.length];
      int t=0;
        for (int i = 0; i < n; i++) {
            res[t++]=nums[i];
            res[t++]=nums[n+i];
        }
        return res;
    }
    public static int[] shuffle(int[] nums, int n) {
int res[]=new int[nums.length];
        Queue<Integer>q1=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q1.offer(nums[i]);
        }
        Queue<Integer>q2=new LinkedList<>();
        for (int i = n; i < 2*n; i++) {
            q2.offer(nums[i]);
        }
        for (int i = 0; i < (2*n); i++) {
            if(i%2==0){
               res[i]=q1.poll();
            }else {
              res[i]=q2.poll();
            }

        }
        return res;
    }

    public static void main(String[] args) {
int arr[] ={2,5,1,3,4,7};
        int res[]=shuffle1(arr,3);
    }
}
