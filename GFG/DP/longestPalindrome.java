Logic1 =>

boolean isPal(String str) {
    int st = 0;
    int end = str.length() - 1;
    while (st < end) {
        if (str.charAt(st) != str.charAt(end)) {
            return false;
        }
        st++;
        end--;
    }
    return true;
}

public String longestPalindrome(String s) {
    String ans = "";
    for (int i = 0; i < s.length(); i++) {
        for (int j = s.length(); j > i; j--) {
            String temp = s.substring(i, j);
            if (isPal(temp) && ans.length() < temp.length()) {
                ans = temp;
            }
        }
    }
    return ans;
}


Logic2 => DP 
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = true;
            for (int j = 0; j < i; ++j) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
  
