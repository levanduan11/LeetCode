package Stirng;

public class Consistent {
    public static boolean isvalid(String s,boolean[]map){
        for (char c:s.toCharArray()
             ) {
            if(map[c-'a']==false)return false;
        }
        return true;
    }
    public static int cou(String all,String []w){
        boolean []a=new boolean[26];
        int res=0;
        for (int i = 0; i < all.length(); i++) {
        a[all.charAt(i)-'a']=true;
        }
        for (int i = 0; i < w.length; i++) {
            res+=isvalid(w[i],a)?1:0;
        }
        return res;
    }
    static boolean check(String s,String a){
        for (int i = 0; i < a.length(); i++) {
            String k="";
           k=new String(k+a.charAt(i));
            if(!s.contains(k))
                return false;
        }
        return true;
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int cout=0;
        for (int i = 0; i < words.length; i++) {
            if(check(allowed,words[i]))cout++;
        }
        return cout;
    }

    public static void main(String[] args) {
String s="abz";
String[]ar={"ad","bd","aaabz","baaz","badabz"};
      //  System.out.println(cou(s,ar));
char []j=new char[256];
       char ss='8';
       int k=ss;
        int o=(int)ss;
        System.out.println(o);
j[98]=47;
        System.out.println(j[98]);

    }
}
