 public static void removeLoop(Node head) {
        // code here
        // remove the loop without losing any nodes
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                help(head,slow);
                break;
            }
        }
    }
    
    public static void help(Node head,Node loop){
        Node p1=head;
        Node p2=loop;
        
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        while(p2.next!=p1){
            p2=p2.next;
        }
        p2.next=null;
    }
