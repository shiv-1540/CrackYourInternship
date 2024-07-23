Q1

//https://leetcode.com/problems/spiral-matrix/

class Solution {
public:
   vector<int> spiralOrder(vector<vector<int>>& matrix) {
    if (matrix.empty()||matrix[0].empty()) {
        return {};
    }

    int left=0,right=matrix[0].size()-1;
    int top=0, bottom=matrix.size()-1;
    vector<int> result;

    while (left <= right && top <= bottom) {
        // Traverse from left to right
        for (int j = left; j <= right; ++j) {
            result.push_back(matrix[top][j]);
        }
        top++;
        
        // Traverse from top to bottom
        for (int i = top; i <= bottom; ++i) {
            result.push_back(matrix[i][right]);
        }
        right--;
        
        if (top <= bottom) {
            // Traverse from right to left
            for (int j = right; j >= left; --j) {
                result.push_back(matrix[bottom][j]);
            }
            bottom--;
        }
        
        if (left <= right) {
            // Traverse from bottom to top
            for (int i = bottom; i >= top; --i) {
                result.push_back(matrix[i][left]);
            }
            left++;
        }
    }

    return result;
}
};
