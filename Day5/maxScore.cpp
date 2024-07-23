Q3

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) {
        int n=cardPoints.size();
        int pts=0;
        for(int i=0;i<n;i++){
             pts+=cardPoints[i];
        }
        int maxi=pts;
        int m=0,pt=pts;
        if(k==n){
            return pts;
        }
        int mini=0,sub=0;
        for(int i=0;i<n-k;i++){
          sub+=cardPoints[i];
        }
        int curr=sub;
        mini=sub;
        for(int i=n-k;i<n;i++){
            curr+=cardPoints[i]-cardPoints[i-(n-k)];
            mini=min(mini,curr);
        }
        return maxi-mini;
    }
};

