package lesso2;

public class Buddy {
    public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            int[] count = new int[26];
            for (int i = 0; i < A.length(); ++i)
                count[A.charAt(i) - 'a']++;

            for (int c: count)
                if (c > 1) return true;
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && A.charAt(first) == B.charAt(second) &&
                    A.charAt(second) == B.charAt(first));
        }
    }
    public static boolean check(String a,String b){
       if(a.length()!=b.length())return false;
        if(a.equals(b)){
            int c[]=new int[26];
            for (int i = 0; i < a.length(); i++) {
                c[a.charAt(i)-'a']++;
            }
            for (int s:c
                 ) {
                if(s>1)return true;

            }
            return false;
        }else {
            int f=-1,s=-1;
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i)!=b.charAt(i)){
                    if(f==-1)f=i;
                    else if(s==-1)s=i;
                    else return false;
                }
            }
            return (s!=-1&&a.charAt(f)==b.charAt(s)&&b.charAt(f)==a.charAt(s));
        }

    }

    public static void main(String[] args) {
        String A="aaaaaaabcbc";
        String B="aaaaaaacbcb";
       // String s=a.substring(0,3)+a.substring(4,5)+a.substring(3,4)+a.substring(5);

      System.out.println(buddyStrings(A,B));



    }
}
