package Stirng;

import java.util.HashMap;

public class isIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
HashMap<Character, Character>i=new HashMap<>();
        for (int j = 0; j < s.length(); j++) {

            if(i.containsKey(s.charAt(j))){
                if(t.charAt(j)!=i.get(s.charAt(j))){
                    return false;
                }

            }
            if(i.containsValue(t.charAt(j))&&!i.containsKey(s.charAt(j))){
return false;
            }
            else {
                i.put(s.charAt(j),t.charAt(j));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="badc";
        String t="baba";
        System.out.println(isIsomorphic(s,t));

    }
}
