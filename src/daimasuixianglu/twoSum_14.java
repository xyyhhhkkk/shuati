package daimasuixianglu;

import java.util.HashMap;
import java.util.Map;

public class twoSum_14 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> set = new HashMap<Integer,Integer>();
        int[] nums1 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(set.containsKey(target - nums[i])){
                int index = set.get(target-nums[i]);
                nums1[0] = i;
                nums1[1] = index;
            }
            else {
                set.put(nums[i],i);
            }
        }
        return(nums1);
    }
}
