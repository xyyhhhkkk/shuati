package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.List;

public class subsets_78 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList<>());
        backtracking(0,nums);
        return result;
    }

    public void backtracking(int startindex, int[] nums){
        if(startindex == nums.length){
            return;
        }
        for (int i = startindex; i < nums.length; i++) {
            path.add(nums[i]);
            result.add(new ArrayList<>(path));
            backtracking(i+1,nums);
            path.remove(path.size()-1);
        }
    }
}
