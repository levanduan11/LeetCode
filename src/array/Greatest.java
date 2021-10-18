package array;

import java.util.ArrayList;
import java.util.List;

public class Greatest {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
List<Boolean>res=new ArrayList<>();

int max=Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            max=Math.max(max,candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>=max)
               res.add(true);
            else {
               res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int ar[] ={2,3,5,1,3};
        List<Boolean>res=kidsWithCandies(ar,3);
    }
}
