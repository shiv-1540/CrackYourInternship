//APPROACH1
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
         vector<int> arr;
         int flag=0;
         for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j] ==target){
                    arr.push_back(i);
                    arr.push_back(j);
                   flag=1;
                   break;
                }
            }
            if(flag){
                break;
            }
         }
          return arr;
    }
};
    

//APPROACH2

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
         unordered_map<int,int> mpp;
         int n=nums.size();
         for(int i=0;i<n;i++){
            int comp=target-nums[i];
            if(mpp.count(comp)){
                return {mpp[comp],i};
            }
            mpp[nums[i]]=i;
         }
         return {};
    }
};
