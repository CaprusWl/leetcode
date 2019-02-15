class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = (left + right) / 2;
        if (nums.length <= 3) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
        
        while (left < right && nums[left] > nums[right]) {
            mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        if (target <= nums[nums.length - 1]) {
            right = nums.length - 1;
        } else {
            right = left - 1;
            left = 0;
        }
        
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        if (nums[left] == target) {
            return left;
        } else {
            return -1;
        }
    }
}
