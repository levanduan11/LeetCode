package Stirng;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class suffixarray {
public suffix[] suffixes;

    public suffixarray(String text) {
        int n=text.length();
        suffixes=new suffix[n];
        for (int i = 0; i < n; i++) {
            suffixes[i]=new suffix(text,i);
        }
        Arrays.sort(suffixes);

    }

    private static class suffix implements Comparable<suffix>{
        private String text;
        private int index;

        public suffix(String text, int index) {
            this.text = text;
            this.index = index;
        }
        private int length(){
            return text.length()-index;
        }
        private char charAt(int i){
            return text.charAt(index+i);
        }


        @Override
        public int compareTo(suffix o) {
        if(this==o)return 0;
        int n=Math.min(this.length(),o.length());
            for (int i = 0; i < n; i++) {
                if(this.charAt(i)>o.charAt(i))return 1;
                if(this.charAt(i)<o.charAt(i))return -1;
            }
            return this.length()-o.length();
        }

        public String toString(){
            return text.substring(index);
        }
    }

    public int length(){
        return suffixes.length;
    }
    public int index(int i){
        if(i<0||i>suffixes.length)throw new IllegalArgumentException();
        return suffixes[i].index;
    }
    public int lcp(int i){
        if(i<=1||i>suffixes.length)throw new IllegalArgumentException();

        return lcpsuffix(suffixes[i-1],suffixes[i]);
    }
    public int lcpsuffix(suffix s,suffix t){
        int n=Math.min(s.length(),t.length());
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)!=t.charAt(i))return i;

        }
        return n;
    }

    public String select(int i){
        if(i<0||i>suffixes.length)throw new IllegalArgumentException();
        return suffixes[i].toString();
    }

  public int compare(String query,suffix s){
        int n=Math.min(query.length(),s.length());
      for (int i = 0; i < n; i++) {
          if(query.charAt(i)>s.charAt(i))return 1;
          if(query.charAt(i)<s.charAt(i))return -1;
      }
      return query.length()-s.length();
  }
public int rank(String query){
        int lo=0;
        int hi=query.length()-1;
        while (lo<hi){
            int mid=lo+(hi-lo)/2;
            int com=compare(query,suffixes[mid]);
          if(com>0)lo=mid+1;
         else if(com<0)hi=mid-1;
         else return mid;
        }
        return -1;
}
public static String lrs(String s){
        String c="";
        int n=s.length();
        suffixarray suffixarray=new suffixarray(s);
    for (int i = 0; i < n; i++) {
        int l=suffixarray.lcp(i);
        if(suffixarray.lcp(i)>c.length()){
            c=s.substring(suffixarray.index(i),suffixarray.index(i)+ suffixarray.lcp(i));
        }
    }

return c;
}

}
