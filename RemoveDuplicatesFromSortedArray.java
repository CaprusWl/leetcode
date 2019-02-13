class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[k] = nums[i];
            if (i + 1 < nums.length && nums[k] != nums[i + 1]) {
                k++;
            }
        }
        return k + 1;
    }
}
