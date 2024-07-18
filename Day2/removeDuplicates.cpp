//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
public:
   int removeDuplicates(vector<int>& nums) {
        vector<int> num;
        int count=1;
       
            num.push_back(nums[0]);
        for(int i=1;i<nums.size();i++){
            if(nums[i]!=nums[i-1]){
                count++;
                num.push_back(nums[i]);
            }
        }
        for(int i=0;i<count;i++){
            nums[i]=num[i];
        }
        return count;
    }
};
