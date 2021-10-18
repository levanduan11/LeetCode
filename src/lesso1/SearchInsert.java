package lesso1;

public class SearchInsert {
    static int search2(int arr[],int x){
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i]<x)continue;
            else {
                break;
            }
        }
        return i;
    }
    static int search(int arr[],int x){
        int count=0;

        for (int i = 0; i < arr.length; i++) {
           if(arr[i]!=x&&x>=arr[i]){
               count++;
           }
           else if(arr[i]==x)return i;

        }
        return count;
    }
    public static void main(String[] args) {
int arr[]={1,3,5,6};
        System.out.println(search2(arr,3));
    }
}
