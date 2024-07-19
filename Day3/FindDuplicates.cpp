//https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<int> ans;
        int i=0;
        while(i<nums.size()-1){
            if(nums[i]==nums[i+1]){
                ans.push_back(nums[i]);
                i++;
            }
            i++;
        }
        return ans;
    }
};

