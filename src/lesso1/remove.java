package lesso1;

public class remove {
    public static void xoatrung(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j]){
                    for (int k = j; k <n-1 ; k++) {
                        arr[k]=arr[k+1];
                    }
                    --j;
                    --n;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
public static int dup(int arr[]){
   // if(arr.length==0)return 0;
    int i=0;
    for (int j = 1; j <arr.length ; j++) {
        if(arr[j]!=arr[i]){
            i++;
            arr[i]=arr[j];

        }
    }
   return i+1;
}
    public  int[] deleteArray(int arr[], int i )
    {
int n=arr.length;
      int newarr[]=new int[arr.length-1];
        for (int j = 0,k=0; j <arr.length ; j++) {
            if(j==i){
                continue;
            }
            newarr[k++]=arr[j];
        }
        return newarr;
    }
  static    void xoa(int arr[],int k){

int n=arr.length;
int i;
        for ( i = k; i <n-1; i++) {
            arr[i]=arr[i+1];

        }
        n=n-1;



      for ( i = 0; i < n; i++) {
          System.out.println(arr[i]);
      }

    }
    public static void main(String[] args) {
        remove remove=new remove();
        int arr[]={1,2,3,4,5};
        xoa(arr,2);
//        int i;
//        int n=arr.length;
//        for(i=2;i<n-1;i++)
//        {
//            arr[i]=arr[i+1];
//        }
//        n=n-1;
//
//        System.out.println("\nOn deleting new array we get is\n");
//        for(i=0;i<n;i++)
//        {
//            System.out.println("a["+i+"] = "+arr[i]);
//        }







    }
}
