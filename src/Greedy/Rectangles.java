package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Rectangles {
    public static int countGoodRectangles(int[][] rectangles) {
int c=0;
int len;
int maxlen=0;
        for (int k[]:rectangles) {
            len=Math.min(k[0],k[1]);
            if(maxlen<len){
                maxlen=len;
                c=1;
            }
            else if(maxlen==len){
                ++c;
            }else
            {
                continue;
            }
        }
        return c;
        }


    public static void main(String[] args) {
      int arr[][]={{5,8},{3,9},{5,12},{16,5}};
      int c=countGoodRectangles(arr);
        System.out.println(c);
    }
    }



