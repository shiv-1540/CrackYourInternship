Q3

//https://leetcode.com/problems/3sum/

// APPROACH1 => Which gives TLE
 vector<vector<int>> threeSum(vector<int>& nums) {
        int n=nums.size();
        vector<vector<int>> arr;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-1;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                for(int k=j+1;k<n;k++){
                    if(k>j+1 && nums[k]==nums[k-1]) continue;
                    if(nums[i]+nums[j]+nums[k]==0 ){
                        arr.push_back({nums[i],nums[j],nums[k]});
                    }
                }
            }
        }
        return arr;
    }


//APPROCH2 optimized O(n^2 logn + nlogn) - o(n^2 logn)

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n=nums.size();

        set<vector<int>> s;
        vector<vector<int>> arr;
        sort(nums.begin(),nums.end());
        
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    s.insert({nums[i],nums[j],nums[k]});
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        for(auto trip:s){
                arr.push_back(trip);
        }
        return arr;
    }
};
