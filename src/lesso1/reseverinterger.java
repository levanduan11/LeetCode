package lesso1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reseverinterger {
    public static int roma(String s){
       HashMap<Character, Integer>hashMap=new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
       int sum=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            int val=hashMap.get(s.charAt(i));
            if(i-1<0||val==1){
                sum+=val;
                continue;
            }
            int prev=hashMap.get(s.charAt(i-1));

  if(val==5&&prev==1){
                sum+=val-prev;
                i--;
            }
         else if(val==10&&prev==1){
                sum+=val-prev;
                i--;
            }
           else if(val==50&&prev==10){
                sum+=val-prev;
                i--;
            }
           else if(val==100&&prev==10){
                sum+=val-prev;
                i--;
            }
         else   if(val==500&prev==100){
               sum+=val-prev;
               i--;
           }
            else if (val==1000&&prev==100) {
                sum+=val-prev;
                i--;
            }
            else {
                sum+=val;
            }


        }
        return sum;

    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romMap = new HashMap<>();
        romMap.put('I', 1);
        romMap.put('V', 5);
        romMap.put('X', 10);
        romMap.put('L', 50);
        romMap.put('C', 100);
        romMap.put('D', 500);
        romMap.put('M', 1000);

        int ans = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length; i++){
            int value = romMap.get(ch[i]);
            if(i != 0){
                if(romMap.get(ch[i-1]) < value){
                    value = value - romMap.get(ch[i-1])*2;
                }
            }
            ans = ans + value;
        }
        return ans;
    }
    public static boolean IsPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }

    public static void main(String[] args) {
        System.out.println(roma("IVIII"));


    }
}
