package stack;

import java.util.Stack;

public class Simplify {
    public static String simplifyPath2(String path){
        Stack<String>stack=new Stack<>();
        String[] s=path.split("/");
        for (String a:s
             ) {
            if(a.equals(".")||a.equals(""))continue;
            else if(a.equals("..")){
                if (!stack.isEmpty())stack.pop();
            }
            else {
                stack.add(a);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if(stack.isEmpty())return "/";
        while (!stack.isEmpty()){
            stringBuilder.insert(0,"/"+stack.pop());
        }
        return stringBuilder.toString();
    }
    public static String simplifyPath(String path) {
        String ss[] = path.split("/");
        Stack<String> sta = new Stack<String>();

        for(String s:ss){
            if(s.equals(".") || s.equals(""))continue;
            else if(s.equals("..")){
                if(!sta.isEmpty())sta.pop();
            }else{
                sta.add(s);
            }
        }

        StringBuilder sb = new StringBuilder();

        if(sta.isEmpty())return "/";
        while(!sta.isEmpty()){
            sb.insert(0, "/"+sta.pop());
        }

        return sb.toString();
    }
    public static void simplifyPath1(String path) {
    Stack<Character>stack=new Stack<>();

    int co=0;
   int i=path.length()-1;

   for (;path.charAt(i)=='/';i--);

        stack.push(path.charAt(i));
        for (int j = i-1; j >=0; j--) {
    if(stack.peek()=='/'){
    while (stack.peek()==path.charAt(j))j--;
        }

            stack.push(path.charAt(j));

        }
String s="";
        while (!stack.isEmpty()){
            s+=stack.pop();
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s="/a./d./c.";

        System.out.println(simplifyPath2(s));
    }
}
