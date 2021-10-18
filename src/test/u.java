package test;

public class u {


    static int uc(int a,int b){
        if(b==0) return a;
        return uc(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(uc(15,20));

    }
}
