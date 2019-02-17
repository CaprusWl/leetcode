class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        if (candidates.length == 0) {
            return null;
        }
        List<List<Integer>> resList = new ArrayList<>();
        backtracking(candidates, target, 0, resList, new ArrayList<Integer>());
        return resList;
    }
    
    void backtracking(int[] candidates, int target, int index, List<List<Integer>> resList, List<Integer> tmp) {
        if (target == 0) {
            resList.add(new ArrayList(tmp));
            return;
        }
        
        for (int i = index; i < candidates.length; i++) {        
            if (candidates[i] > target) {
                return;
            }
            tmp.add(candidates[i]);
            backtracking(candidates, target - candidates[i], i, resList, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
