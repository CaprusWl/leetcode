class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        
        int lo = 0, hi = nums.length - 1, mid;
        while (lo < hi) {
            mid = (lo + hi) / 2;
            if (nums[mid] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        if (lo < nums.length && nums[lo] >= target) {
            return lo;
        } else {
            return nums.length;
        }
    }
}
