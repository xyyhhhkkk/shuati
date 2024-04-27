package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 注意：数层去重需要对数组进行排序
public class combinationSum2_40_2 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates,target,1);
        return result;

    }
    public void backtracking(int[] candidates, int target, int startindex){
        if(target == 0){
            result.add(new ArrayList<>(path));
        }

        for (int i = startindex; i < candidates.length; i++) {
            if (candidates[i] == candidates[i-1]){
                continue;
            }
            path.add(candidates[i]);
            backtracking(candidates,target-candidates[i], i+1);
            path.remove(path.size()-1);
        }
    }

}
