class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        
        if (n == 0) {
            return res;
        }
        
        int l = 0, r = n - 1, t = 0, d = n - 1;
        int index = 1;
        
        while (true) {
            for (int col = l; col <= r; col++) res[t][col] = index++;
            if (++t > d) break;
            for (int row = t; row <= d; row++) res[row][r] = index++;
            if (--r < l) break;
            for (int col = r; col >= l; col--) res[d][col] = index++;
            if (--d < t) break;
            for (int row = d; row >= t; row--) res[row][l] = index++;
            if (++l > r) break;
        }
        
        return res;
    }
}
