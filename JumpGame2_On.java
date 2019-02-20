class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int step = 0, curFarthest = 0, curEnd = 0;
        for (int i = 0; i < n - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                step++;
                curEnd = curFarthest;
            }
        }
        return step;
    }
}
