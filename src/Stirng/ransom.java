package Stirng;

import java.util.HashMap;
import java.util.Map;

public class ransom {
    public static void main(String[] args) {

        boolean result = canConstruct("aabb", "aabbcc");
        System.out.println(result);
        Map<Integer, Integer>map=new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
       int a= map.getOrDefault(5,0);
        System.out.println(a);
    }


    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] array = magazine.toCharArray();

        int[] countArray = new int[26];
        for(char c : array){
            countArray[c-'a']++;
        }

        array = ransomNote.toCharArray();
        for(char c : array){
            if(countArray[c-'a'] > 0){
                countArray[c-'a']--;
            }else {
                return false;
            }
        }
        return true;
    }
}
