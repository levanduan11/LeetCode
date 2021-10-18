package DPandR;

public class CreateMaximumNumber {
    public static int[] maxNumber1(int[] nums1, int[] nums2, int k) {

        String[] max1= helper1(nums1, Math.min(nums1.length,k));  // calculate max for num1
        String[] max2= helper1(nums2, Math.min(nums2.length,k)); // calculate max for num2

        // merge two max array
        String ans = "";
        for(int t=0;t<=k;t++) { // k*k*k
            int len1 = Math.min(nums1.length, t);
            int len2 = Math.min(nums2.length, k-t);
            if(len1+len2 != k) continue;
            String ans1 = max1[len1];
            String ans2 = max2[len2];
            StringBuilder tmp = new StringBuilder();
            while (tmp.length() < k) {
                char ch;
                if(ans1.compareTo(ans2)>=0){
                    ch=ans1.charAt(0);
                    ans1=ans1.substring(1);
                }
                else {
                    ch=ans2.charAt(0);
                    ans2=ans2.substring(1);
                }
                tmp.append(ch);
            }
            ans=max(ans,tmp.toString());

        }

        int[] tmp = new int[ans.length()];
        for(int i=0;i<tmp.length;i++){
            tmp[i]=ans.charAt(i)-'0';
        }
        return tmp;
    }
    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
int m=nums1.length,n=nums2.length;
if(m+n<k)return new int[0];
String [][][]dp=new String[m+1][n+1][k+1];
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n; j++) {
                for (int l = 0; l <=k ; l++) {
                    if(i+j<l)dp[i][j][l]="";
                    else {
                        String chooseAi=(i==0||l==0)?"":dp[i-1][j][l-1]+nums1[i-1];
                        String chooseBi=(j==0||l==0)?"":dp[i][j-1][l-1]+nums2[j-1];
                        String maxchoose=max(chooseAi,chooseBi);

                        String ignoreAi=(i==0)?"":dp[i-1][j][l];
                        String ignoreBi=(j==0)?"":dp[i][j-1][l];
                        String ignoreboth=(i==0||j==0)?"":dp[i-1][j-1][l];
                        String maxIgnore=max(max(ignoreAi,ignoreBi),ignoreboth);
                        dp[i][j][l]=max(maxchoose,maxIgnore);


                    }
                }
                
            }
            
        }

return convert(dp[m][n][k]);
    }
    private static String max(String s1,String s2){
        return (s1.compareTo(s2)<0)?s2:s1;
    }
    public static String max1(String s1,String s2){
        return (s1.compareTo(s2)<0)?s2:s1;
    }
    private static int[]convert(String s){
        int n=s.length(),res[]=new int[n];
        for (int i = 0; i < n; i++) {
            res[i]=s.charAt(i)-'0';
        }
        return res;
    }
    public static String[] helper1(int[] A, int k) {
        int m = A.length;
        String[][] dp = new String[m+1][k+1];
        for (int i = 0; i <= m; i++) {
            for (int l = 0; l <= k; l++) {
                String chooseAi = (i == 0 || l == 0) ? "" : dp[i - 1][l - 1] + A[i - 1];
                String ignoreAi = (i == 0) ? "" : dp[i - 1][l];
                dp[i][l] = max(chooseAi, ignoreAi);
            }
        }
        return dp[m];
    }
    public static void main(String[] args) {
        int a[]={3,4,6,5};
        int b[]={9,1,2,5,8,3};
   int res[]=maxNumber1(a,b,5);
     ///  String []ss=helper1(b,5);

      //System.out.println("az".compareTo("abzzzz"));
    }
}
