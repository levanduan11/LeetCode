package lesso1;

public class Leng {
    public static int lengthOfLastWord(String s){

        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (len != 0 && s.charAt(i) == ' ')
                return len;
            if (s.charAt(i) != ' ')
                len++;
        }
        return len;
    }
    public static void main(String[] args) {
        String s=" ";
//        System.out.println(s.charAt(s.length()-1));
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
        System.out.println(lengthOfLastWord(" "));
    }
}
