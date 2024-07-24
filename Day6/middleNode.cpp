class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        if(head==NULL){
            return NULL;
        }
        int cnt=0;
        ListNode* temp=head;
        while(temp!=NULL){
          temp=temp->next;
          cnt++;
        }
        cnt=cnt/2;
        ListNode* temp1=head;
        while(cnt--){
            temp1=temp1->next;
        }
        return temp1;
    }
};
