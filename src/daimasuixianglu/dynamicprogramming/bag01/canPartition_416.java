package daimasuixianglu.dynamicprogramming.bag01;

// 五步法分析
// 1. 数组定义和数组含义：这将是一个一维数组dp,dp[i]代表当还剩i值需要被加入子集的时候，已经加入了dp[i]的值在子集.
// 2. 递推方法：dp[i] = max(dp[i],dp[i-nums[i]]+nums[i])
// 3. 初始化：dp[i] = 0
// 4. 遍历顺序：从前往后
// 5. 打印dp：纠错

import java.util.Arrays;

public class canPartition_416 {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum%2 != 0){
            return false;
        }
        sum = sum/2;
        int[] dp = new int[sum+1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = sum; j >=nums[i]; j--) {
                if (j>=nums[i]){
                    dp[j] = Math.max(dp[j],dp[j-nums[i]]+nums[i]);
                }
                if (dp[sum] == sum){
                    return true;
                }
            }
        }
        return false;
    }
}
