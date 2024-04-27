package daimasuixianglu.dynamicprogramming.bag_wanquan;

import java.util.Arrays;

public class numSquares_279 {

    public int numSquares(int n) {
        int num = (int)Math.sqrt(n);
        int[] nums = new int[num];
        for (int i = 1; i <= num; i++) {
            nums[i-1] = i*i;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i]; j <= n; j++) {
                if(dp[j-nums[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j-nums[i]]+1);
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE? -1:dp[n];
    }
}
