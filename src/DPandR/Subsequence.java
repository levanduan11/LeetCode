package DPandR;

public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
//int i=0;
//int j=0;
//while (i<s.length()&&j<t.length()){
//    if(s.charAt(i)==t.charAt(j)){
//        i++;
//        j++;
//    }else {
//        j++;
//    }
//}
//return i==s.length();


      if(s.isEmpty())return true;
      if(t.isEmpty())return false;
        boolean check=s.charAt(0)==t.charAt(0);
        if(check){
           return isSubsequence(s.substring(1),t.substring(1));
        }else {
           return isSubsequence(s,t.substring(1));
        }


    }

    public static void main(String[] args) {
        String s="abcd";
        String t="ahbgcd";
        System.out.println(isSubsequence(s,t));
    }
}
