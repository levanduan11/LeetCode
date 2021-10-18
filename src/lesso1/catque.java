package lesso1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class catque {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        List<Integer>list=new ArrayList<>();
        int cout=0;

        for (int i = 0; i < s.size(); i++) {
            for (int j = i+1; j <s.size() ; j++) {
                if((s.get(i)+s.get(j))%k!=0){
                    if (list.contains(s.get(i)))continue;
                    else {
                        list.add(s.get(i));
                    }
                    if(list.contains(s.get(j)))continue;
                    else {
                        list.add(s.get(j));
                    }
                }
            }
        }
     return list.size();
    }
    static int[] a(int[] a){
        Arrays.sort(a);
        int resul[]=new int[a.length];
        int temsort=1;
        int index=1;
        resul[0]=a.length;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==a[i+1])
              temsort++;
            else {
                resul[index]=resul[index-1]-temsort;
                index++;
                temsort=1;
            }
        }
   int res[]=new int[index];
        for (int i = 0; i < index; i++) {
            res[i]=resul[i];
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();

        s.add(1);
        s.add(7);
        s.add(2);
        s.add(4);
if(3%3!=0){
    System.out.println("d");
}
else {
    System.out.println(9);
}


    }

}
