Q5

//https://leetcode.com/problems/word-search/

class Solution {
public:
    bool backtrack(vector<vector<char>>& board, string& word, int i, int j,
                   int k) {
        int m = board.size();
        int n = board[0].size();

        if (k == word.length()) {
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word[k]) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '\0'; // Marking visited

        if (backtrack(board, word, i + 1, j, k + 1) ||
            backtrack(board, word, i - 1, j, k + 1) ||
            backtrack(board, word, i, j + 1, k + 1) ||
            backtrack(board, word, i, j - 1, k + 1)) {
            return true;
        }

        board[i][j] = temp; // Restoring the original value
        return false;
    }

    bool exist(vector<vector<char>>& board, string word) {
        int m = board.size();
        int n = board[0].size();

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
};
