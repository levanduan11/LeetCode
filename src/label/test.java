package label;

public class test {

    void sum (int a,int b){
        t:{
        ok:{
            System.out.println();
        }
        }

        }

    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 3; i++) {

            loop2:
            for (int j = 0; j < 3; j++) {
                System.out.println("j = "+j);
                if(j==1&&i==1){
                   break loop1;
                }
            }
            System.out.println("i = "+i);
        }
    }
}
