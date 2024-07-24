
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size();
        
       unordered_map<int,int> mpp;
       for(int i=0;i<n;i++){
         mpp[nums[i]]++;
       }
        int maxi=0,cnt=0;
       for(const auto& num:mpp){
          if(num.second>cnt){
             cnt=num.second;
             maxi=num.first;
          }
          cout<<num.second<<" ";
       }
       return maxi;
    }
};
