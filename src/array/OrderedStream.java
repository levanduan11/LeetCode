package array;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    String values[];
    int idx=0;

    public OrderedStream(int n) {
        this.values=new String[n];
    }
    public  List<String>insert(int key,String value){
        values[key-1]=value;
        List<String>ret=new ArrayList<>();
        while (idx<values.length){
            if(values[idx]==null)break;
            ret.add(values[idx++]);
        }
        return ret;
    }

    public static void main(String[] args) {
        OrderedStream o=new OrderedStream(5);
        o.insert(1,"aaaa");
    }
}
