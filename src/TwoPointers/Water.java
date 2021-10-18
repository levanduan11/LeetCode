package TwoPointers;

public class Water {
    public static int maxArea(int[] height) {
int max=0;
int maxsta=0;
int i=1;int s=0;int end=height.length-1;
int j=height.length-2;
while (s<end){
  if(height[s]>height[end]){
     maxsta=Math.max(maxsta,(end-s)*height[end]);
     end--;
  }else {
      maxsta=Math.max(maxsta,(end-s)*height[s]);
      s++;

  }
}
max=Math.max(max,maxsta);

return max;
    }

    public static void main(String[] args) {
int arr[] ={1,8,6,2,5,4,8,3,7};
maxArea(arr);
    }
}
