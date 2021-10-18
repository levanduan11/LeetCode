package hastable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring3(String s){
      int max=0;
      int cout=0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j <s.length() ; j++) {
                if(s.charAt(j)!=s.charAt(j-1)&&s.charAt(j)!=s.charAt(i)){
                    cout++;
                    max=Math.max(j-i+1,cout);
                }
                else {
                    i++;
                    cout=0;
                }

            }

        }
        return max;
    }
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int result = 0;

        HashMap<Character,Integer> h = new HashMap<Character,Integer>();

        int lo = 0;
        for (int i = 0; i <= n-1; i++) {
            int idx = h.getOrDefault(s.charAt(i), -1);
            if (idx != -1) lo = Math.max(idx+1, lo);
            h.put(s.charAt(i), i);
            result = Math.max(i-lo+1, result);
        }

        return result;
    }
    public static int lengthOfLongestSubstring(String s){
        int i=0,j=0;
        int max=0;
        Map<Character,Integer>map = new HashMap<>();

        while (i<s.length()){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                max=Math.max(max,map.size());
                i++;
            }else {
                map.remove(s.charAt(j));
                j++;
            }

        }
        return max;
    }
    public static int lengthOfLongestSubstring1(String s) {

        Set<Character> set = new HashSet<Character>();
        int size =0, i =0, j=0;

        while(i < s.length()) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                size = Math.max(set.size(), size);
                i++;
            }
            else {
                set.remove(s.charAt(j));
                j++;
            }
        }

        return size;
    }
public static int len(String s){
        Map<Character, Integer>m=new HashMap<>();
        int star=0;
        int max=1;
    for (int i = 0; i < s.length(); i++) {
        if(m.containsKey(s.charAt(i))){
            if(m.get(s.charAt(i))>star){
                star=m.get(s.charAt(i));
            }
            m.put(s.charAt(i),i+1);
            max=Math.max(max,i+1-star);
        }
    }
    return max;
}
    public static void main(String[] args) {
        String s="abcdaf";
        System.out.println(lengthOfLongestSubstring2(s));
        System.out.println(len(s));


    }
}
