package lesso1;

public class CountandSay {
    public String count2 (int n ){
        if(n==1)return "1";
        String a="1";
        for (int i = 2; i <=n ; i++) {
            a=f2(a);
        }
        return a;
    }
    public String f2(String s){
        char ch=s.charAt(0);
        int cout=1;
        StringBuilder sv = new StringBuilder();
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i)!=ch){
                sv.append(cout).append(ch);
                ch=s.charAt(i);
                cout=1;
            }
            else {
                cout++;
            }
        }
        sv.append(cout).append(ch);
        return sv.toString();
    }
    public String count(int n){
        if(n==1)return "1";
        String ans="1";
        for (int i = 2; i <=n ; i++) {
            ans=f(ans);
        }
        return ans;
    }
  public   String f(String s){
        char ch=s.charAt(0);
        int count=1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i)!=ch){
                sb.append(count).append(ch);
                ch=s.charAt(i);
                count=1;

            }
            else {
                count++;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }
    public static void main(String[] args) {
       CountandSay c=new CountandSay();
        System.out.println(c.count(5));

    }
}
