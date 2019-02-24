class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<Integer>();
        }
        
        int n = matrix.length, m = matrix[0].length;
        List<Integer> resList = new ArrayList<>();
        int u = 0, l = 0, d = n - 1, r = m - 1;
        while (true) {
            for (int col = l; col <= r; col++) resList.add(matrix[u][col]);
            if (++u > d) break;
            for (int row = u; row <= d; row++) resList.add(matrix[row][r]);
            if (--r < l) break;
            for (int col = r; col >= l; col--) resList.add(matrix[d][col]);
            if (--d < u) break;
            for (int row = d; row >= u; row--) resList.add(matrix[row][l]);
            if (++l > r) break;
        }
        
        return resList;
    }
}
