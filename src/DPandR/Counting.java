package DPandR;

public class Counting {
    static int sum(int n,int s){

        if(n==0)return s;

       return sum(n/10,s+n%10);
    }
    static int t(int n,int s){

        if(n==0) return s;
       return t(n/2,s*10+n%2);
    }

    public static int[] countBits(int num) {
        int res[]=new int[num+1];

        for (int i = 0; i <=num ; i++) {
int r=t(i,0);
res[i]=sum(r,0);
        }
        return res;
    }
public static void main(String[] args) {
//    System.out.println(sum(10,0));


   // System.out.println(countBits(10000000000));
    System.out.println(t(6,0));

}
}
