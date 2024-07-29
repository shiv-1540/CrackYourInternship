//Q3
//https://leetcode.com/problems/remove-linked-list-elements/

class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        if(!head) return NULL;
         ListNode* dum= new ListNode(0);
         dum->next=head;
        ListNode* temp=dum;
         
        while(temp->next!=NULL){
            if(temp->next->val==val){
                ListNode* temp1=temp->next;
                temp->next=temp->next->next;
                delete temp1;
            }
            else{
              temp=temp->next;
            }
        }
        ListNode* temp2=dum->next;\
        delete dum;
        return temp2;
    }
};

//APPROCH2 => Optimized 
ListNode* removeElements(ListNode* head, int val) {
        ListNode* temp = head;
        ListNode* newHead = new ListNode(0);
        ListNode* newTemp = newHead;

        while(temp != NULL)
        {
            if(temp-> val != val)
            {
                newTemp-> next = new ListNode(temp-> val);
                newTemp = newTemp-> next;
            }
            temp = temp-> next;
        }
        return newHead-> next;
    }
