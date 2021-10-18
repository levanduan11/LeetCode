package lesso1;

import java.util.Arrays;

public class test {
    static int equalizeArray(int[] arr){
        int coutn[] =new int [10];
        for (int i = 0; i < arr.length; i++) {
            coutn[arr[i]]++;

        }
        int max=coutn[0];
        for (int i = 0; i <coutn.length ; i++) {
            if(coutn[i]>max)max=coutn[i];
        }
        return arr.length-max;
    }
    public static void main(String[] args) {

//        int arr[]={3, 3, 2, 1, 3};
//        System.out.println(equalizeArray(arr));
//        float a=(2*2+2)>>1;
//        //System.out.println(a);
//        System.out.println(1<<2);
//        System.out.println();
//        System.out.println(Math.pow(2,9));
//        System.out.println(2<<4);//==
//        System.out.println(Math.pow(2,4)+Math.pow(2,4));
//
//        System.out.println(7-(7&(-7)));
//        System.out.println((9&(-1)));
//        System.out.println(~5);//-6
//        System.out.println(2^9);//
//        System.out.println(5<<3);//k*2^x
//        System.out.println(100>>2);//4/2^2,k/2^x
//        System.out.println(32|200);
//        System.out.println(4&5);
//        System.out.println((4&5)|(~7));
        System.out.println(8&-8);
        String s=Integer.toBinaryString(-8);
        System.out.println(s);

    }
}
