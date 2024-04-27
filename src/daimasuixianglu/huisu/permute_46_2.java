package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class permute_46_2 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums);
        return result;
    }
    public void backtracking(int[] nums){
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            set.add(nums[i]);
            backtracking(nums);
            path.remove(path.size()-1);
            set.remove(set.size()-1);
        }
    }
}
