 Node[] alternatingSplitList(Node head) {
        // code here
        
        Node [] arr=new Node[2];
        if(head==null){
            return arr;
        }
         
         Node temp1=head;
         Node temp2=head.next;
         
         arr[0]=temp1;
         arr[1]=temp2;
         
         Node t1=temp1;
         Node t2=temp2;
         Node t=head;
         
        while (t1 != null && t1.next != null) {
              t1.next = t1.next.next;  // skip one node for first list
              t1 = t1.next;  // move t1 to next valid node
           if(t2.next!=null){
              t2.next = t2.next.next;  // skip one node for second list
              t2 = t2.next;  // move t2 to next valid node   
           }
        }

        return arr;
    }





  // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        if(head.next==null) return new Node[]{head,null};
        
        Node head1=head, head2= head.next, h1=head1, h2=head2;
        head= head2.next; int c=2;
        
        while(head!=null ) {
            if(c%2 ==0){
                head1.next= head; 
                head1= head1.next; c++;
            } else {
                head2.next= head; 
                head2= head2.next; c++;
            }
            head= head.next;
        }
        
        head1.next= null; head2.next= null;
        
        return new Node[]{ h1, h2 };
    }
