class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first, last;
        int lo = 0, hi = nums.length - 1, mid;
        while (lo < hi) {
            mid = (lo + hi) / 2;
            if (nums[mid] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        
        if (nums.length == 0 || nums[lo] != target) {
            return new int[] {-1, -1};
        }
        
        first = lo;
        lo = 0;
        hi = nums.length - 1;
        while (lo < hi) {
            mid = (lo + hi + 1) / 2;
            if (nums[mid] <= target) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        last = hi;
        return new int[] {first, last};
    }
}
