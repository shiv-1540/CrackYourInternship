Q4

//https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=0,j=0,k=0;
        vector<int> ans(m+n);
        while(i!=m && j!=n){
              if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                
                k++;
                i++;
              }
              else if(nums1[i]>nums2[j]){
                ans[k++]=nums2[j];
                
                j++;
              }
              else{
                ans[k++]=nums1[i];
                ans[k++]=nums2[j];
                i++;
                j++;
              }
        }
        while(i<=m-1){
            ans[k++]=nums1[i];
            i++;
        }
        while(j<=n-1){
            ans[k++]=nums2[j];
            j++;
        }
        for(int i=0;i<m+n;i++){
          nums1[i]=ans[i];
        }
    }
};
