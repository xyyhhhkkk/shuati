package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2_40 {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used;
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length];
        Arrays.fill(used, false);
        Arrays.sort(candidates);
        backtracking(candidates, target,0, 0);
        return result;
    }
    public void backtracking(int[] candidates, int target, int sum, int startindex){
        if (sum>target){
            return;
        }
        if(sum == target){
            result.add(new ArrayList<>(path));
        }

        for (int i = startindex; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            sum = sum+candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, sum, i+1);
            used[i] = false;
            sum = sum-candidates[i];
            path.remove(path.size()-1);
        }
    }
}
