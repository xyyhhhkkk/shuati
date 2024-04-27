package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum_39_2 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates,target);
        return result;
    }

    public void backtracking(int[] candidate, int target){
        if (target == 0){
            result.add(new ArrayList<>(path));
        }
        for (int i = 0; i < candidate.length; i++) {
            if(target>0){
                path.add(candidate[i]);
                backtracking(Arrays.copyOfRange(candidate, i, candidate.length),target-candidate[i]);
                path.remove(path.size()-1);
            }
        }
    }

}
