package label;

import java.util.ArrayList;

public class test3 {
   static int i;
  static   ArrayList<Integer>list=new ArrayList<>();

    {
        System.out.println(8);//thuc thi khi new mot object
    }
    static {
        i=9;
        list.add(4);
        list.add(4);
        System.out.println(i);
        for (int a:list
             ) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
new test3();
    }

}
