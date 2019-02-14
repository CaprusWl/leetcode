class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int index = 0;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i;
                break;
            }
        }
        
        if (index == 0) {
            Arrays.sort(nums);
            return;
        }
        
        int bigger = 0;
        for (int i = nums.length - 1; i >= index; i--) {
            if (nums[i] > nums[index - 1]) {
                bigger = i;
                break;
            }
        }
        
        int tmp = nums[bigger];
        nums[bigger] = nums[index - 1];
        nums[index - 1] = tmp;
        
        Arrays.sort(nums, index, nums.length);
        return;
    }
}
