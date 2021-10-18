package Stirng;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pangram {
    public static boolean checkIfPangram2(String sentence) {
     Set<Character>set=new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));

        }
        return set.size()==26;
    }

    public static boolean checkIfPangram1(String sentence) {
  int cout[]=new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            cout[sentence.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(cout[i]==0)return false;
        }
        return true;
    }

    public static boolean checkIfPangram(String sentence) {
       Map<Character, Integer>map=new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            map.put(sentence.charAt(i),1);
        }
return map.size()==26;
    }

    public static void main(String[] args) {
     checkIfPangram("y");
    }
}
