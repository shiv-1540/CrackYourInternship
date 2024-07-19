//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxi=0;
        int k=prices[0];
        int total=0;
        for(int i=1;i<prices.size();i++){
           if(prices[i]-k>0){
            total+=prices[i]-k;
           }
            k=prices[i];
        }
        return total;
    }
};

