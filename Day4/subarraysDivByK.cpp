Q1

//https://leetcode.com/problems/subarray-sums-divisible-by-k/

class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int cnt=0;
        int n=nums.size();
        unordered_map<int,int> mpp;
        mpp[0]=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=(sum+nums[i])%k;
            if(sum<0){
                sum+=k;
            }
            cnt+=mpp[sum];
            mpp[sum]++;
        }
          return cnt;
    }
};

