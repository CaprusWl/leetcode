class Solution {
    public boolean isMatch(String s, String p) {
        
        if(s == null || p == null)
            return false;
        
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n + 2][m + 2];
        
        dp[0][0] = true;
        for (int i = 1; i < m; i++) {
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (p.charAt(j) == '*' && j > 0) {
                    if (s.charAt(i) != p.charAt(j - 1) && p.charAt(j - 1) != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1] || dp[i + 1][j] || dp[i][j + 1];
                    }
                }
            }
        }
        
        return dp[n][m];
    }
}
