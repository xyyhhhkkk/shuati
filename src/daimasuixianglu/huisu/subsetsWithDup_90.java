package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup_90 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int[] used = new int[nums.length];
        Arrays.sort(nums);
        backtracking(nums,0,used);
        return result;
    }
    public void backtracking(int[] nums, int startindex,int[] used){
        result.add(new ArrayList<>(path));
        if (startindex == nums.length) {
            return;
        }
        for (int i = startindex; i < nums.length; i++) {
            if(i>0 && nums[i-1] == nums[i] && used[i-1] == 0){
                continue;
            }
            path.add(nums[i]);
            used[i] = 1;
            backtracking(nums,i,used);
            path.remove(path.size()-1);
            used[i] = 0;
        }
    }
}
