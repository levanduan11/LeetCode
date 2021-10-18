package DPandR;

public class Trapping {
    public static int r(int []height){
        if(height.length==0)return 0;
        int res=0;
        int n=height.length;
        int l[]=new int[n];
        int r[]=new int[n];

        l[0]= height[0];
        for (int i = 1; i < n; i++) {
            l[i]=Math.max(height[i],l[i-1]);
        }
        r[n-1]=height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            r[i]=Math.max(height[i],r[i+1]);

        }
        for (int i = 1; i < n-1; i++) {
            res+=Math.min(l[i],r[i])-height[i];
        }
        return res;
    }
    public static int trap(int[] height) {
int lexmax=0;
int rightmax=0;
int l=0;
int r=height.length-1;
int res=0;
while (l<r){
    if(height[l]<height[r]){
       if(height[l]>lexmax)lexmax=height[l];
       res+=lexmax-height[l];
       l++;
    }else {

            if (height[r] > rightmax) rightmax = height[l];
            res += rightmax - height[r];
            --r;

    }
}
return res;
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(r(arr));


    }
}
