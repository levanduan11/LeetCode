package label;

public class test2 {
    public static void main(String[] args) {
        boolean c=true;
        fist:
        {
            secon:
            {
                three:
                {
                    System.out.println(3);
                    if(c){
                        break fist;
                    }
                }
                System.out.println(2);
            }
            System.out.println(1);
        }
    }
}
