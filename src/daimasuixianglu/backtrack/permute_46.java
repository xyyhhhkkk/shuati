package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class permute_46 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums,new HashSet<>());
        return result;
    }

    public void backtracking(int[] nums, HashSet<Integer> set){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            set.add(nums[i]);
            backtracking(nums,set);
            path.remove(path.size()-1);
            set.remove(nums[i]);
        }
    }
}
