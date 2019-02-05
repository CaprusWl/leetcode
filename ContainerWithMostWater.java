class Solution {
    public int maxArea(int[] height) {
        int[] max = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            max[i] = 0;
            for (int j = 0; j < i; j++) {
                if ((i - j) * Math.min(height[i], height[j]) > max[i]) {
                    max[i] = (i - j) * Math.min(height[i], height[j]);
                }
            }
        }
        
        int maxRes = 0;
        for (int i = 1; i < height.length; i++) {
            if (max[i] > maxRes) {
                maxRes = max[i];
            }
        }
        
        return maxRes;
    }
}
