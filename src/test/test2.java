package test;

import java.io.File;
import java.util.regex.Pattern;

public class test2 {
   static int updateBit(int num, int i, boolean bitlsl) {
         int value = bitlsl ? 1 : 0;
        int mask = ~(1<< i);
        return (num & mask) |(value <<i);
         }
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c;
        c=a||b;
       // System.out.println(c);
        System.out.println(1<<2);
        int s=0;
     //   System.out.println(updateBit(5,1,true));
        String kk="dkfdkfhdf";
      //  System.out.println(kk.hashCode());
        int t=99999999&0x7fffffff;
        System.out.println(t);
        int k=9&10278796;
        System.out.println(k);
        int d=9;

    }
}
