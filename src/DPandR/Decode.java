package DPandR;

import java.util.HashMap;

public class Decode {
    boolean check(String s){
        String[]arr=s.split("");
        if(Integer.parseInt(arr[0])==0)return false;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(Integer.parseInt(arr[i])==0&&Integer.parseInt(arr[i-1])>2)return false;
        }
        return true;
    }
    public int numDecodings(String s) {
      if (!check(s))return 0;
        String[]arr=s.split("");
        boolean a=Integer.parseInt(arr[0])>0&&Integer.parseInt(arr[s.length()-1])<26;
        if(s.length()==1&&a)return 1;
        boolean b=Integer.parseInt(arr[1])>0&&Integer.parseInt(arr[s.length()-1])<7;
        if(s.length()==2&&a&&b)return 2;
        if(s.length()==2&&Integer.parseInt(arr[1])==0)return 1;
        if(s.length()==2&&Integer.parseInt(arr[1])>6)return 1;

int dp[]=new int[s.length()+2];

        if(Integer.parseInt(arr[0])==0)return 0;
dp[0]=0;
if (Integer.parseInt(arr[0])>0&&Integer.parseInt(arr[s.length()-1])<26)dp[2]=1;
        if (Integer.parseInt(arr[1])>0&&Integer.parseInt(arr[s.length()-1])<7)dp[3]=2;

        for (int i = 4,j=2; i <dp.length; i++,j++) {
            if(Integer.parseInt(arr[j])==0){
                dp[i]=dp[i-2];
                dp[i+1]=dp[i++];
            }else if (Integer.parseInt(arr[j])>6){
                dp[i]=dp[i-1];
            }else
                dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[s.length()+1];
    }
    public static void main(String[] args) {
        HashMap<Character, Integer>s=new HashMap<>();
        int j=1;
        for (char i = 'a'; i <= 'z'; i++) {
            s.put(i,j++);
        }
        Decode d=new Decode();
String k="27";
        String[]arr=k.split("");
        System.out.println(d.numDecodings(k));

    }
}
