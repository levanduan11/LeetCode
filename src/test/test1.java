package test;

import java.util.*;

public class test1 {

static void de(int n,int arr[], ArrayList<Integer>res){

    if(n==0)return;
    res.add(arr[n-1]);
    de(n-1,arr,res);

}
    public static void main(String[] args) {
  Map<String, String>map=new TreeMap<>();
int arr[]={9,9,9,7,7,7,5,4,2,1,1,2,3,4};
        ArrayList<Integer>res=new ArrayList<>();
Arrays.sort(arr);
int cout=1;
int j=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]==arr[j]){
                j++;
                cout++;

            }else {
                System.out.println("so lan xuat hien"+arr[j]+" : "+cout);
                res.add(cout);
                cout=1;
                j=j+1;

            }
        }
        System.out.println("so lan xuat hien"+arr[j]+" : "+cout);





    }
}
