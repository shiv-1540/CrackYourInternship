


public ListNode swapPairs(ListNode head) {
       
        ListNode dummy=new ListNode(-1);

        dummy.next=head;
        ListNode prev=dummy;
       
        while(head!=null && head.next!=null){
             ListNode first=head;
             ListNode second=head.next;

             first.next=second.next;
             second.next=first;             
             prev.next=second;

             prev=first;
             head=first.next;
        }
        return dummy.next;
    }
