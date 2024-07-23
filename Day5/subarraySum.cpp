Q4
//https://leetcode.com/problems/subarray-sum-equals-k/

//APPROACH1

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int total=0,sum=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    total++;
                }
            }
        }
        return total;
    }
};
