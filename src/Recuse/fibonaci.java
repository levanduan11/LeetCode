package Recuse;

public class fibonaci {
    static int fibo(int n){
        int arr[]=new int[n+1];
        if(n==0)return 0;
        else if(n==1)return 1;
        else if(arr[n]>0)return arr[n];
        arr[n]=fibo(n-1)+fibo(n-2);
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
