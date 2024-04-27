package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

public class subsets_78 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return result;
    }

    public void backtracking(int[] nums, int startindex){
        result.add(new ArrayList<>(path));
        if (startindex >= nums.length){
            return;
        }
        for (int i = startindex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
