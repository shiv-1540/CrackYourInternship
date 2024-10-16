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
