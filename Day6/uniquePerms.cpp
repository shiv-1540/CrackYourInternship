//https://www.geeksforgeeks.org/problems/all-unique-permutations-of-an-array/0

//APPROCH1 => By Me
class Solution {
  public:
    vector<vector<int>> uniquePerms(vector<int> &arr ,int n) {
        // code here
        sort(arr.begin(),arr.end());
        set<vector<int>>s;
        
        
        do{
            s.insert(arr);
        }while(next_permutation(arr.begin(),arr.end()));
      
      vector<vector<int>> as(s.begin(),s.end());
        return as;
    }
};

//APPROACH 2=> Optimized Solution

class Solution {
  public:
    void solve(int i, vector<vector<int>> &ans, vector<int> &arr, int n) {
        if(i >= n) {
            ans.push_back(arr);
            return;
        }
         
        
        for(int j = i; j < n; j++) {
            swap(arr[i], arr[j]);
            solve(i+1, ans, arr, n);
            swap(arr[i], arr[j]);
        }
        
    }
    
    vector<vector<int>> uniquePerms(vector<int> &arr ,int n) {
        vector<vector<int>> ans;
        solve(0, ans, arr, n);
        
        sort(ans.begin(), ans.end());
        ans.erase(unique(ans.begin(), ans.end()), ans.end());
        return ans;
    }
};
