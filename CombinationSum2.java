class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) {
            return null;
        }
        Arrays.sort(candidates);
        HashSet<List<Integer>> resList = new HashSet<>();
        backtracking(candidates, target, 0, resList, new ArrayList<Integer>());
        return new ArrayList(resList);
    }
    
    void backtracking(int[] nums, int target, int index, HashSet<List<Integer>> resList, List<Integer> tmp) {
        if (target == 0) {
            resList.add(new ArrayList(tmp));
            return;
        }
        
        for (int i = index; i < nums.length; i++) {
            if (nums[i] > target) {
                return;
            }
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            tmp.add(nums[i]);
            backtracking(nums, target - nums[i], i + 1, resList, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
