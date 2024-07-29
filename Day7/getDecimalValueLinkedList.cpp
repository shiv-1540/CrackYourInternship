//Q2
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

class Solution {
public:
    int getDecimalValue(ListNode* head) {

       ListNode* temp=head;
       ListNode* temp1=head;
       int cnt=0;
       while(temp->next!=NULL){
        temp=temp->next;  
        cnt++; 
       }
       cout<<cnt<<" ";
       int ans=0;
       while(cnt>=0){
          ans=ans+(temp1->val)*  pow(2,cnt);
          cout<<temp1->val<<" ";
          temp1=temp1->next;
          cnt--;
       }
       return ans;
      }
};

class Solution {
    public int getDecimalValue(ListNode head) {
        int num=0;
        while(head!=null){
            num = num*2+head.val;
            head=head.next;
        }
        return num;
    }
}
