// Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        int cnt=0;
        
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        if(k>cnt){
            return -1;
        }
        temp=head;
        int i=0;
        while(i<cnt-k){
            temp=temp.next;
            i++;
        }
        return temp.data;
    }
