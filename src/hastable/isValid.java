package hastable;

import java.util.HashMap;
import java.util.Stack;

public class isValid {
    public static boolean isValid(String s) {
HashMap<Character, Character>k=new HashMap<>();
        k.put('(',')');
        k.put('[',']');
        k.put('{','}');
        Stack<Character>r=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char h=s.charAt(i);
            if(k.containsKey(h)){
                r.add(k.get(h));
            }else {
              if(r.isEmpty()||r.pop()!=h){
                  return false;
              }
            }
        }
        return r.isEmpty();
    }

    public static void main(String[] args) {
        String s="]";
        System.out.println(isValid(s));
    }
}
