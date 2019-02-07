class Solution {
    
    int res, tmp;
    
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        
        Arrays.sort(nums);
        res = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length - 2; i++) {
            tmp = nums[i] + nums[nums.length - 2] + nums[nums.length - 1];
            if (tmp < target) {
                compare(target);
                continue;
            }
            tmp = nums[i] + nums[i + 1] + nums[i + 2];
            if (tmp > target) {
                compare(target);
                return res;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                tmp = nums[i] + nums[j] + nums[k];
                if (tmp == target) {
                    return target;
                }
                if (tmp < target) {
                    compare(target);
                    j++;
                }
                if (tmp > target) {
                    compare(target);
                    k--;
                }
            }
        }
        return res;
    }
    
    private void compare(int target) {
        if (Math.abs(tmp - target) < Math.abs(res - target)) {
            res = tmp;
        } 
    }
}
