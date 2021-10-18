package array;

import java.util.Arrays;

public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int narr[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while (i<nums1.length&&j<nums2.length){
            if(nums1[i]>nums2[j]){
                narr[k++]=nums2[j++];
            }else {
                narr[k++]=nums1[i++];
            }

        }
        if(i<nums1.length){
            for (int l = i; l <nums1.length ; l++) {
                narr[k++]=nums1[i++];
            }
        }
        if(j<nums2.length){
            for (int l = j; l <nums2.length ; l++) {
                narr[k++]=nums2[j++];
            }
        }
        if(narr.length==3)return narr[1];
        else if(narr.length%2==0){
            double v=(narr[ narr.length/2-1]+narr[ narr.length/2]);
      return (v/2);
        }
        else return narr[ narr.length/2];

    }
    public static double findMedianSortedArrayss(int[] nums1, int[] nums2) {
        int narr[]=new int[nums1.length+nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            narr[i]=nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            narr[i+nums1.length]=nums2[i];

        }
        Arrays.sort(narr);
if(narr.length==3)return narr[1];
      else if(narr.length%2==0){
            double v=(narr[ narr.length/2-1]+narr[ narr.length/2]);
            return (v/2);
        }else {
            return  narr[ narr.length/2];
        }

    }
    public static void arr(int a[],int b[]){
        //        for (int i = 0, j=a.length; i <a.length||i<b.length; i++,j++) {
//            narr[i]=a[i];
//            narr[j]=b[i];
//        }
        int narr[]=new int[a.length+b.length];
int i=0,j=0,k=0;
       while (i<a.length&&j<b.length){
           if(a[i]>b[j]){
               narr[k++]=b[j++];
           }else {
               narr[k++]=a[i++];
           }

       }
       if(i<a.length){
           for (int l = i; l <a.length ; l++) {
               narr[k++]=a[i++];
           }
       }
       if(j<b.length){
           for (int l = j; l <b.length ; l++) {
               narr[k++]=b[j++];
           }
       }
        for (int s:narr
             ) {
            System.out.println(s);
        }
        System.out.println();
       if(narr.length%2==0){
           int v=(narr[(int) narr.length/2-1]+narr[(int) narr.length/2]);
           System.out.println(v/2);
       }else {
           System.out.println(narr[(int) narr.length/2]);
       }
    }

    public static void main(String[] args) {
        int a[]={1,2};
        int b[]={3,4};
       // arr(a,b);
        System.out.println(findMedianSortedArrays(a,b));
    }
}
