//APPROACH3

class Solution {
public:
    int maxProfit(vector<int>& prices) {
    int n=prices.size();
    if (n<2) return 0; 

    int mini=prices[0];
    int maxi=0;

    for (int i=1;i<n;i++) {
        if (prices[i]<mini) {
            mini=prices[i];
        } else {
            maxi=max(maxi,prices[i]-mini);
        }
    }

    return maxi;
}
};
