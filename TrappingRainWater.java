class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxLeft = 0, maxRight = 0;
        int left = 0, right = n - 1;
        int res = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] > maxLeft) maxLeft = height[left];
                if (height[left] < maxLeft) res += maxLeft - height[left];
                left++;
            } else {
                if (height[right] > maxRight) maxRight = height[right];
                if (height[right] < maxRight) res += maxRight - height[right];
                right--;
            }
        }
        
        return res;
    }
}
