package array;

public class Subarrays {
    public static int sum(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            arr[i]+=arr[i-1];
        }
        int sum=arr[arr.length-1];
        int size=3;
        while (size<=arr.length){

            for (int i = size-1; i <arr.length ; i++) {
               int k=i-size;
               sum+=arr[i]-(k>=0?arr[k]:0);
            }
            size=size+2;
        }
        return sum;
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        for(int i = 1; i < arr.length ; i++)
        {
            arr[i] += arr[i - 1];
        }
        int sum = arr[arr.length - 1];

        // now looping around the array using the size which will be always odd
        int size = 3;
        while(size <= arr.length)
        {
            for(int j = size - 1; j < arr.length ; j++)
            {
                int i = j - size;
                sum += arr[j] - (i >= 0 ? arr[i] : 0);
            }

            size += 2;
        }
        return sum;
    }


    public static void main(String[] args) {
        int arr[]={10,11,12};
       System.out.println(sum(arr));
       // System.out.println(sumOddLengthSubarrays(arr));
    }
}
