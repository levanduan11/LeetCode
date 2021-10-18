package Stirng;

public class Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for (String ss:word1
             ) {
            s1+=ss;
        }
        for (String ss:word2
        ) {
            s2+=ss;
        }
        return s1.equals(s2);
    }
}
