package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findSubsequences_491 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return result;
    }
    public void backtracking(int[] nums, int startindex){
        if (path.size()>1){
            result.add(new ArrayList<>(path));
        }
        Set<Integer> set = new HashSet<>();
        for (int i = startindex; i < nums.length; i++) {
            if (!path.isEmpty()&&set.contains(nums[i])&&path.get(path.size()-1)>nums[i]){
                continue;
            }
            path.add(nums[i]);
            set.add(nums[i]);
            backtracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
