package array;

import java.util.Arrays;

public class Triplets
{

    public static int countGoodTriplets1(int[] arr, int a, int b, int c) {
        int tripletCount = 0;
        for(int i = 0; (i + 3) <= arr.length; i++) {
            for(int j = i+1; (j+2) <= arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) <= a) {
                    for(int k = j+1; k < arr.length; k++) {
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k]-arr[i]) <= c) {
                            tripletCount++;
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return tripletCount;
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
int cout=0;
int s=0;

        for (int i = 0; i <= arr.length-3; i++) {
            for (int j = i+1; j <=arr.length-2 ; j++) {

                  if(Math.abs(arr[i]-arr[j])<=a){
                      for (int k =j+1 ; k <arr.length ; k++) {
                          if(((Math.abs(arr[j]-arr[k]))<=b)&&((Math.abs(arr[i]-arr[k]))<=c)){
                              cout++;
                          }
                      }
                  }

            }
        }
        return Math.max(s,cout);
    }

    public static void main(String[] args) {
int arr[] ={7,3,7,3,12,1,12,2,3};
        System.out.println(countGoodTriplets(arr,5,8,1));
    }

}
