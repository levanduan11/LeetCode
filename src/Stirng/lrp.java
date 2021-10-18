package Stirng;

import java.util.*;

public class lrp {
    public static int l(String s){
        int co=0;
        int max=0;
        ArrayList<Character>arrayList=new ArrayList<>();
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i+j)!=s.charAt(j)){

                }


            }
            max=co;
            co=0;
        }
        return max;
    }
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String maxStr = "";
        int i=0, j=i+1;
        while (i<s.length()) {
            map.put(s.charAt(i), 1);
            while (j<s.length()&&!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), 1);
                j++;
            }
            // short form Java if statement in next line
            maxStr = (maxStr.length()<s.substring(i,j).length()) ? s.substring(i,j) : maxStr;
           // System.out.println(maxStr);
            i++;
            // reset j to in front of i
            j = i+1;
            // clear map to start all over again to possibly find an even larger string
            map.clear();
        }
        return maxStr.length();
    }
    public static int sb(String a,String b){
        int cout=0;
        for (int i = 0; i < Math.min(a.length(),b.length()); i++) {

            if(a.charAt(i)!=b.charAt(i))break;
            cout++;
        }
        return cout;

    }
    public static void main(String[] args) {
        String a="abcabcbb";

        System.out.println(l(a));

    }
}
