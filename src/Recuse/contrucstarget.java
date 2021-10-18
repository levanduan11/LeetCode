package Recuse;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class contrucstarget {
    static boolean check(int arr[]){
        int sum=0;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        int diff=sum-arr[max];
        if(arr[max]==1||diff==1)return true;
        if(diff>arr[max]||diff==0||arr[max]%diff==0)return false;

        arr[max]%=diff;

        return check(arr);
    }
    static boolean check1(int arr[]){
        int sum=0;
      PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->a-b);
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
           q.offer(arr[i]);
        }

       while (q.peek()!=1){
           int value=q.poll();
            int diff = sum - value;
            if (value == 1 || diff == 1) return true;
            if (diff > value || diff == 0 || value % diff == 0) return false;

           value %= diff;
           sum=diff+value;
           q.offer(value);


        }
       return true;
    }
    public static void main(String[] args) {
        int arr[] ={9,3,5};
        System.out.println(check1(arr));
      //  ArrayList
    }
}
