package lesso1;

import java.util.LinkedList;

public class Merge {
    public static List merge(List l1,List l2){
        List node=new List(-1);
        List curr=node;
        while (l1!=null&&l2!=null){
            if(l1.val<= l2.val){
                curr.next=l1;
                l1=l1.next;
            }else {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if(l1!=null){
            curr.next=l1;
        }
        if(l2!=null){
            curr.next=l2;
        }
        return node.next;
    }

    public static void main(String[] args) {
List l1=new List();
        l1.val=1;
        l1.val=2;
        l1.val=4;
  List l2=new List();
        l2.val=1;
        l2.val=3;
        l2.val=4;
    List node=merge(l1,l2);
    while (node!=null){
        System.out.println(node.val);
        node=node.next;
    }
    }
}
class List{
    int val;
    List next;

    public List() {
    }

    public List(int val) {
        this.val = val;
    }

    public List(int val, List next) {
        this.val = val;
        this.next = next;
    }
}
