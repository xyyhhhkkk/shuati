package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique_47_2 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums,0,used);
        return result;
    }
    public void backtracking(int[] nums, int startindex, boolean[] used){
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startindex; i < nums.length; i++) {
            if (i>0 && nums[i-1] == nums[i] && !used[i-1]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backtracking(nums,i+1,used);
            used[i] = false;
            path.remove(path.size()-1);
        }
    }
}
