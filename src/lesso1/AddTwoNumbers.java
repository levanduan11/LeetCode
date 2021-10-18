package lesso1;

import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
       
       }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
ListNode q=l1,p=l2,curr=dummyHead;
int carr=0;
while (q!=null||p!=null){
    int x=(q!=null)?l1.val:0;
    int y=(p!=null)?l2.val:0;
    int sum=x+y+carr;
    carr=sum/10;
    curr.next=new ListNode(sum%10);
    curr=curr.next;
    if(q!=null)q=q.next;
    if(p!=null)p=p.next;

}
if(carr>0){
    curr.next=new ListNode(carr);

}
return dummyHead.next;
    }
}
class ListNode {
     int val;
     ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }