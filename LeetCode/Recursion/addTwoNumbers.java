Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       return helper(l1, l2, 0);
    }
    private ListNode helper(ListNode l1, ListNode l2, int carry){
        if(l1==null&&l2==null&&carry==0) return null;
        int sum = carry;
        if(l1!=null) sum+=l1.val;
        if(l2!=null) sum+=l2.val;
        ListNode node = new ListNode(sum%10);
        node.next = helper(l1!=null? l1.next: null, l2!=null? l2.next:null, sum/10);
        return node;
    }
