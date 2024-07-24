
//https://leetcode.com/problems/jump-game/

class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();
        int maxi=nums[0];
        if(maxi==0 && n==1){
            return true;
        }
        else if(maxi==0) return false;
        for(int i=1;i<n;i++){
            if(maxi==0) return false;
            maxi--;
            if(nums[i]>maxi){
                maxi=nums[i];
            }
            cout<<maxi<<" ";
        }
        return true;
    }
};

