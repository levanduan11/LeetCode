package Stirng;

public class Split {
    public static int balancedStringSplit(String s) {
int star=0;
int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='L'){
                star++;
            }else {
                star--;
            }if(star==0){
                sum+=1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
String s="RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
