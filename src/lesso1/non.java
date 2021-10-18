package lesso1;

public class non {
    public static void main(String[] args) {
        int s[]={0, 5, 7, 10};
        System.out.println(nonn(4,s));
    }
    static int nonn(int k,int []s){
        int []re=new int[k];
        for (Integer e:s){
            re[e%k]++;
        }
        int zero=re[0];
        int maxnum=zero>0?1:0;
        for (int i = 1; i <=k/2; i++) {
            if(i!=k-i)
            maxnum+=Math.max(re[i],re[k-i]);
            else {
                maxnum++;
            }
        }
        return maxnum;
    }
}
