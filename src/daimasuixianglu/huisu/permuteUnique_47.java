package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class permuteUnique_47 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] used = new int[nums.length];
        Arrays.sort(nums);
        backtracking(nums,used);
        return result;
    }
    public void backtracking(int[] nums, int[] used){
        if (path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i-1] == nums[i] && used[i-1] == 0){
                continue;
            }
            if (used[i] == 1) continue;
            path.add(nums[i]);
            used[i] = 1;
            backtracking(nums,used);
            path.remove(path.size()-1);
            used[i] = 0;
        }
    }
}
