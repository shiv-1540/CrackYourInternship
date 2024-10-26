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
