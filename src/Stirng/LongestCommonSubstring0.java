package Stirng;

public class LongestCommonSubstring0{
    public int longestCommonSubstring(char str1[], char str2[]){
        int T[][] = new int[str1.length+1][str2.length+1];

        int max = 0;
        for(int i=1; i <= str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j]){
                        max = T[i][j];
                    }
                }
            }
        }
        return max;
    }

    /**
     * Recursive way of calculating lcs
     */
    public int longestCommonSubstringRec(char str1[], char str2[], int pos1, int pos2, boolean checkEqual){
        if(pos1 == -1 || pos2 == -1){
            return 0;
        }
        if(checkEqual){
            if(str1[pos1] == str2[pos2]){
                return 1 + longestCommonSubstringRec(str1, str2, pos1-1, pos2-1, true);
            }else{
                return 0;
            }
        }
        int r1 = 0;
        if(str1[pos1] == str2[pos2]){
            r1 = 1 + longestCommonSubstringRec(str1, str2, pos1-1, pos2-1, true);
        }
        return Math.max(r1,Math.max(longestCommonSubstringRec(str1, str2, pos1-1, pos2, false), longestCommonSubstringRec(str1, str2, pos1, pos2-1,false)));
    }
    private static String longestCommonSubstring(String S1, String S2)
    {
        int Start = 0;
        int Max = 0;
        for (int i = 0; i < S1.length(); i++)
        {
            for (int j = 0; j < S2.length(); j++)
            {
                int x = 0;
                while (S1.charAt(i + x) == S2.charAt(j + x))
                {
                    x++;
                    if (((i + x) >= S1.length()) || ((j + x) >= S2.length())) break;
                }
                if (x > Max)
                {
                    Max = x;
                    Start = i;
                }
            }
        }
        return S1.substring(Start, (Start + Max));
    }

    public static void main(String args[]){
        LongestCommonSubstring0 lcs = new LongestCommonSubstring0();
        char str1[] = "kaaaaa".toCharArray();
        char str2[] = "laaaaa".toCharArray();
        System.out.println(lcs.longestCommonSubstring(str1, str2));
        System.out.println(lcs.longestCommonSubstringRec(str1, str2,str1.length-1, str2.length-1,false));
    }

}
