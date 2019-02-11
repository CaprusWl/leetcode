class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 4, 0);
    }
    
    private ArrayList<List<Integer>> kSum(int[] nums, int target, int k, int index) {
        ArrayList<List<Integer>> resList = new ArrayList<>();
        if (index >= nums.length) {
            return resList;
        }
        
        if (k == 2) {
            int i = index;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    // 这里不能用asList方法，asList方法返回的是Arrays$ArrayList，而Arrays$ArrayList没
                    // 有重写add和remove方法，对于这两个方法默认抛出UnsupportedOperationException异常。
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    resList.add(tmp);
                    while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                        i++;
                    }
                    while (j > 0 && nums[j] == nums[j - 1]) {
                        j--;
                    }
                    i++;
                    j--;
                }
                if (sum < target) {
                    i++;
                }
                if (sum > target) {
                    j--;
                }
            }
        } else {
            for (int i = index; i < nums.length - k + 1; i++) {
                ArrayList<List<Integer>> tmpList = kSum(nums, target - nums[i], k - 1, i + 1);
                if (tmpList != null) {
                    for (List<Integer> l : tmpList) {
                        l.add(0, nums[i]);
                    }
                    resList.addAll(tmpList);
                }
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return resList;
    }
}
