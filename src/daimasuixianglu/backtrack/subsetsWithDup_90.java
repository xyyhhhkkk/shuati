package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup_90 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        backtracking(nums, 0, used);
        result.add(new ArrayList<>(path));
        return result;
    }

    public void backtracking(int[] nums, int startindex, boolean[] used){
        if(startindex == nums.length){
            return;
        }

        for (int i = startindex; i < nums.length; i++) {
            if (i>0 && !used[i-1] && nums[i-1] == nums[i]){
                continue;
            }
            path.add(nums[i]);
            result.add(new ArrayList<>(path));
            used[i] = true;
            backtracking(nums,i+1, used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}
