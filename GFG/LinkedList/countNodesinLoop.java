 public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow=head;
        Node fast=head;
        boolean flag=true;
        int cnt=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                if(cnt==0){
                    flag=false;
                }
                else{
                    return cnt;
                }
            }
            if(!flag){
                cnt++;
            }
        }
        return 0;
    }
