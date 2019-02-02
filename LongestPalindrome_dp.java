class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n + 1][n + 1];
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j <= n - 1; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1]);
                
                if (dp[i][j] && (res.equals("") || res.length() < j - i + 1)) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
