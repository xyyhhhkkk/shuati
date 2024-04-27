package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum_39 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates,list,target);
        return result;
    }

    public void backtracking(int[] candidates, List<Integer> templist, int target){
        if(target == 0){
            result.add(new ArrayList<>(templist));
        }
        for (int i = 0; i < candidates.length; i++) {
            if(target>0){
                target -= candidates[i];
                templist.add(candidates[i]);
                backtracking(Arrays.copyOfRange(candidates, i, candidates.length),templist,target);
                target += candidates[i];
                templist.remove(templist.size()-1);
            }
        }
    }

    // 下面是优化的写法，可以直接不要for循环了
    public void dfs(int[] candidate, int target, List<List<Integer>> res, List<Integer> templist, int index){
        if(index == candidate.length){
            return;
        }
        if(target == 0){
            return;
        }
        // 接下来有两种走法，一种是直接跳过该index的值，另一种是选择当前的index值
        // 1. 直接跳过
        dfs(candidate,target,res,templist,index+1);
        if(target>=candidate[index]){
            templist.add(candidate[index]);
            dfs(candidate,target-candidate[index],res,templist,index);
            templist.remove(templist.size()-1);
        }
    }
}
