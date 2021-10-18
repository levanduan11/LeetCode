package DPandR;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parentheses {
    public static int longestValidParenthesesdp(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }
    public int longestValid(String s){
        int l=0,r=0,max=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                l++;
            }else {
                r++;
            }
            if(l==r){
                max=Math.max(max,2*r);
            }else if(r>=l){
                l=0;
                r=0;
            }
        }
        l=r=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)=='('){
                l++;
            }else {
                r++;
            }
            if(l==r){
                max=Math.max(max,2*l);
            }else if(l>=r){
                l=r=0;
            }
        }
        return max;
    }
    public static boolean isvalid(String s){
        Stack<Character>stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push('(');
            }else if(stack.peek()=='('&&!s.isEmpty()){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static int longvalid(String s ){
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+2; j <=s.length() ; j+=2) {
               if( isvalid(s.substring(i,j))){
                    max=Math.max(max,j-i);
                }
            }
        }
        return max;
    }
    public static int longestValidParentheses(String s){
        Stack<Integer>stack=new Stack<>();
        stack.push(-1);
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    max=Math.max(max,i-stack.peek());
                }
            }
        }
return max;
    }
    public static int test(String s){
int n=s.length();
int co=0;
       Map<Character, Character>map = new HashMap<>();
       map.put('(',')');
       Stack<Character> stack=new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
           if(map.containsKey(c)){
               stack.push(c);
           }else if(map.containsValue(c)&&!stack.isEmpty()){
               if(c!=stack.pop()){
                   co+=2;
               }
           }
        }
        return co;
    }

    public static void main(String[] args) {
        String s="()((()))((()))";
        System.out.println(longestValidParenthesesdp(s));
    }
}
