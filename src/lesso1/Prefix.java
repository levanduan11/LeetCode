package lesso1;

public class Prefix {
    public static void main(String[] args) {
        String s[]= {"flower","flow","flight"};
String sa="levanduan";
String jj="du";
        //System.out.println(sa.indexOf(jj));
        System.out.println(longestCommonPrefix(s));
    }

    public static String longest(String []strs){
       String res="";
       int minlen=Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if(minlen>strs[i].length())minlen=strs[i].length();
        }
        for (int i = 0; i < strs[i].length(); i++) {
            char prev=strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i)!=prev)return res;
            }
            res+=strs[0].charAt(i);
        }
        return res;
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        String str= strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(str)!=0){
                str=str.substring(0, str.length()-1);
                if(str.isEmpty())return "";
            }
        }
        return str;
    }
    public static String check(String s,String m){
int n=s.length();
int k=m.length();
int y=1;int j;
StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < n; i++) {

            for ( j = 0; j < k; j++) {
                if (s.charAt(i + j) != m.charAt(j)) {

                    break;
                }
              stringBuilder.append(s.charAt(i+j));
            }


            }
       return stringBuilder.toString();



        }

    }

