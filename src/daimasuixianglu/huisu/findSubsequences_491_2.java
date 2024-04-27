package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findSubsequences_491_2 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return result;
    }
    public void backtracking(int[] nums, int startindex){
        if(path.size()>1){
            result.add(path);
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = startindex; i < nums.length; i++) {
            if (!path.isEmpty()&&path.get(path.size()-1)>nums[i] || set.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            set.add(nums[i]);
            backtracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }

}
