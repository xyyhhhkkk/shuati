package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class permute_46 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        int[] used = new int[nums.length];
        backtracking(nums,used);
        return result;
    }
    public void backtracking(int[] nums, int[] used){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1){
                continue;
            }
            path.add(nums[i]);
            used[i] = 1;
            backtracking(nums,used);
            used[i] = 0;
            path.remove(path.size()-1);
        }
    }

}
