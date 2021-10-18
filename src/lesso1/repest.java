package lesso1;

public class repest {
    static int jumpingOnClouds(int[] c) {

        int count=0;
        int i=0;
        while(i<c.length-1){
            if(i+2<c.length&&c[i+2]!=1){
                count++;
                i=i+2;
            }
            else{
                count++;
                i++;
            }
        }
        return count;

    }
    static int jumpingOnCloud(int[] c) {
        int count = -1;
        int n=c.length;
        for (int i = 0; i < n; i++ ) {
            if (i<n-2&&c[i+2]==0) i++;
            count++;
        }
       return count;

    }

    public static void main(String[] args) {


        int art[] = {0, 0, 0, 1, 0, 0};
        System.out.println(jumpingOnClouds(art));
    }
    static long repeatedString(String s, long n) {
        long vl=0;
        int  l=s.length();
        int cou=0;
        for (int i = 0; i < s.length(); i++) {
          if(s.charAt(i)=='a'){
              vl++;
          }
        }
long sum=((long)n/l)*vl;
        for (int i = 0; i < (n%l); i++) {
            if(s.charAt(i)=='a'){
                cou++;
            }
        }
        sum=sum+cou;
return sum;
    }


}
