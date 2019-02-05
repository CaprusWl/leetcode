class Solution {
    public int maxArea(int[] height) {
        int maxRes = 0, left = 0, right = height.length - 1, res = 0;
        while (left < right) {
            if (height[left] > height[right]) {
                res = height[right] * (right - left);
                right--;
            } else {
                res = height[left] * (right - left);
                left++;
            }
            if (res > maxRes) {
                maxRes = res;
            }
        }
        return maxRes;
    }
}
