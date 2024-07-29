Q4
//https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
public:
   ListNode* mergeTwoLists(ListNode* temp1, ListNode* temp2) {
    ListNode list3; // Dummy node
    ListNode* curr=&list3;

    while (temp1 != NULL && temp2 != NULL) {
        if (temp1->val<temp2->val) {
            curr->next=temp1;
            temp1=temp1->next;
        } else {
            curr->next=temp2;
            temp2=temp2->next;
        }
        curr=curr->next;
    }

    // Attach remaining nodes
    if (temp1!=NULL) {
        curr->next = temp1;
    } else if (temp2!=NULL) {
        curr->next=temp2;
    }

    return list3.next; // Skip dummy node
}
};
