package hastable;

import java.util.HashMap;
import java.util.Map;

public class Jewels {
    static boolean chek(String a,char b){
        for (int i = 0; i < a.length(); i++) {
          if(a.charAt(i)==b)return true;
        }
        return false;
    }
    public static   int numJewelsInStones(String jewels, String stones) {
       Map<Character, Integer>map=new HashMap<>();
       int cout=0;
        for (int i = 0; i < stones.length(); i++) {
            if(!map.containsKey(stones.charAt(i))){
                map.put(stones.charAt(i),1);
            }else {
                map.put(stones.charAt(i),map.get(stones.charAt(i))+1);
            }
        }
        for (int i = 0; i < jewels.length(); i++) {
            if(map.containsKey(jewels.charAt(i))){
                cout+=map.get(jewels.charAt(i));
            }
        }
        return cout;
    }

    public static void main(String[] args) {
        String s="aabbccdd";
        numJewelsInStones("",s);
    }
}
