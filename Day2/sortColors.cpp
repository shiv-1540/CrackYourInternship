//https://leetcode.com/problems/sort-colors/description/

//Approach1
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int cnt0=0,cnt1=0,cnt2=0;
     
        for(int i=0;i<nums.size();i++){
           if(nums[i]==0) cnt0++;
           if(nums[i]==1) cnt1++;
           if(nums[i]==2) cnt2++;
        }
        
        for(int i=0;i<nums.size();i++){
            if(i<cnt0){
                nums[i]=0;
            }
            else if(i>=cnt0 && i<cnt0+cnt1){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }
    }
};

// APPROACH2

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int start=0,end=nums.size()-1,mid=0;

        while(mid<=end){
           if(nums[mid]==0){
            swap(nums[start],nums[mid]);
            start++;
            mid++;
           }
           else if(nums[mid]==1){
            mid++;
           }
           else{
            swap(nums[mid],nums[end]);
            end--;
           }
        }
    }
};
