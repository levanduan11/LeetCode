package DPandR;

import java.util.Stack;

public class Nesting {
    public static int maxDepth(String s) {
        int sum=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                start++;
                sum=Math.max(sum,start);
            }else{
                start--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
String s="(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
