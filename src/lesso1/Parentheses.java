package lesso1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parentheses {
     static class Solution {
       Map<Character, Character> mappings = new HashMap<>();
       {
            mappings.put('(', ')');
            mappings.put('[', ']');
            mappings.put('{', '}');
        }

        public boolean isValid(String s) {
            Stack<Character> parenthesis = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (mappings.containsKey(c)) {
                    parenthesis.push(mappings.get(c));
                } else if (mappings.containsValue(c)) {
                    if (parenthesis.isEmpty() || parenthesis.pop() != c) {
                        return false;
                    }
                }
            }
            return parenthesis.isEmpty();
        }
    }
    public static void main(String[] args) {
Solution s=new Solution();
        HashMap<Character, Character>hashMap=new HashMap<>();
        hashMap.put('(',')');
        hashMap.put('[',']');
        hashMap.put('[',']');
      String ss="{[()]}";
      //  System.out.println(hashMap);
       System.out.println(s.isValid(ss));
       // System.out.println(hashMap.containsValue(')'));
    }

    public static boolean check2(String s){
      HashMap<Character, Character>hashMap=new HashMap<>();
        hashMap.put('(',')');
        hashMap.put('[',']');
        hashMap.put('{','}');
        Stack<Character>stack=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(hashMap.containsKey(c)){
                if(stack.isEmpty()||stack.pop()!=hashMap.get(c))return false;
            }
            else
                stack.push(c);
        }
        return stack.isEmpty();
    }

}
