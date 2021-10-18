package lesso1;

public class maxarray {
    static int sum(int arr[]){
        int s=0;int a=arr[0];
        for (int i = 0; i < arr.length; i++) {
          if(s<0)s=0;
          s+=arr[i];
          a=Math.max(s,a);
        }
        return a;
    }
    public static void main(String[] args) {
int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sum(arr));
    }
}
