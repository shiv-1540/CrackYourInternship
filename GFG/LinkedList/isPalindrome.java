 boolean isPalindrome(Node head) {
        // Your code here
        Stack<Integer> s1=new Stack<>();
        Node temp=head;
        while(temp!=null){
            s1.push(temp.data);
            temp=temp.next;
          
        }
        temp=head;
        while(temp!=null){
            int s2=s1.peek();
            s1.pop();
            if(temp.data!=s2){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
