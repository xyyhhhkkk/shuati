package daimasuixianglu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_16 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        // 先进行排序
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; ++i) {
            if(i>0&&nums[i] == nums[i-1]){
                continue;
            }
            int third = n-1;
            int target = -nums[i];
            for (int second = i+1; second < n; ++second) {
                if(second>i+1 && nums[second] == nums[second-1]){
                    continue;
                }
                while (second<third&&nums[second]+nums[third]>target){
                    --third;
                }
                if(second==third){
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;

    }

}
