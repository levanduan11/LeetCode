package hastable;

import java.util.HashMap;
import java.util.Map;

public class Repeated {
    public static int repeatedNTimes(int[] A) {
Map<Integer, Integer>map=new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if(!map.containsKey(A[i])){
                map.put(A[i],1);
            }else {
                map.put(A[i],map.get(A[i])+1);
            }
            if(map.get(A[i])>1)return A[i];
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
