package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum_39 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            sum = sum+candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, sum, i);
            sum = sum-candidates[i];
            path.remove(path.size()-1);
        }
    }
}
