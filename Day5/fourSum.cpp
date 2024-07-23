Q2

//https://leetcode.com/problems/4sum/
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> arr;
        if(nums.size()<4) return arr;
     
        sort(nums.begin(),nums.end());
        int n=nums.size();
        long long sum=0;
        for(int i=0;i<n-3 ;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1,m=n-1;
               while(k<m){
                
                 sum=(long long)nums[i]+nums[j]+nums[k]+nums[m];
                 if(sum==target){
                    arr.push_back({nums[i],nums[j],nums[k],nums[m]});
                    while(k<m && nums[k]==nums[k+1]) k++;
                    while(k<m && nums[m-1]==nums[m]) m--;
                    k++;
                    m--;
                 }
                 else if(sum<target){
                   k++;
                 }
                 else{
                    m--;
                 }
               }
            }
        }
        return arr;
    }
};
