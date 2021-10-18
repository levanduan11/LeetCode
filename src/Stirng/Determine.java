package Stirng;

public class Determine {
    static boolean check(char c){
        char []r={'a', 'e', 'i', 'o', 'u', 'A', 'E','I', 'O', 'U'};
        for (int i = 0; i < r.length; i++) {
            if(r[i]==c)return true;
        }
        return false;
    }
    public static boolean halvesAreAlike(String s) {
char []r={'a', 'e', 'i', 'o', 'u', 'A', 'E','I', 'O', 'U'};

        int c1=0;
        int c2=0;
        for (int i = 0,j=s.length()-1; i <s.length()/2 &&j>=s.length()/2; i++,j--) {
            if(check(s.charAt(i)))c1++;
            if(check(s.charAt(j)))c2++;
        }
        return c1==c2;
    }

    public static void main(String[] args) {
     System.out.println(halvesAreAlike("AbCdEfGh"));

        System.out.println(check('p'));
    }
}
