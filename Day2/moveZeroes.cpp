//https://leetcode.com/problems/move-zeroes/

// APPROACH1

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int start=0,end=nums.size()-1,cnt0=0;

        for(int i=0;i<nums.size();i++){
            if(nums[i]!=0){
               nums[start]=nums[i];
               start++;
            }
        }
        while(start<=end){
            nums[start++]=0;
        }
      
    }
};

// APPROACH2

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int left=0;
        for(int right=0;right<nums.size();right++){
            if(nums[right]!=0){
                swap(nums[right],nums[left]);
                left++;
            }
        }
      
    }
};

