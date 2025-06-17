/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode reverseList(ListNode head) {
        ListNode curr=head;
        // ListNode dummy=new ListNode(-1);

        ListNode prev=null;
        while(curr!=null){
              ListNode temp=curr.next;
              curr.next=prev;
              prev=curr;
              curr=temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
    
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
    
            ListNode second=slow.next;
            slow.next=null;
            second=reverseList(second);
         
         ListNode first=head;
         while(second!=null){
            ListNode tmp1=first.next;
            ListNode tmp2=second.next;

            first.next=second;
            second.next=tmp1;
            
            first=tmp1;
            second=tmp2;
         }
    }
}
