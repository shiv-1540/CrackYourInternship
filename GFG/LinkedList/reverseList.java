  Node reverseList(Node head) {
        // code here
        Node curr=head;
        Node prev=null;
        
        while(curr!=null){
           Node temp=curr.next;
           curr.next=prev;
           prev=curr;
           curr=temp;
        }
        return prev;
    }

Node reverseList(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node newhead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
