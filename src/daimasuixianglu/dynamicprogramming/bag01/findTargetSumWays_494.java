package daimasuixianglu.dynamicprogramming.bag01;

import java.util.Arrays;

public class findTargetSumWays_494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if((sum+target)%2 != 0){
            return 0;
        }
        if (Math.abs(target) > sum) return 0;
        if (nums.length == 1&&nums[0]==sum) return 1;
        int dpmax = (sum+target)/2;
        int[] dp = new int[dpmax+1];
        dp[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = dpmax; j >= nums[i]; j--) {
                dp[j] += dp[j-nums[i]];
            }
        }
        return dp[dpmax];
    }
}
