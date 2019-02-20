class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= nums[i]; j++) {
                if (i + j < n && dp[i + j] > dp[i] + 1) {
                    dp[i + j] = dp[i] + 1;
                }
            }
        }
        return dp[n - 1];
    }
}
