package daimasuixianglu.dynamicprogramming.dajiajieshe;
// 五步法分析
// 1. 数组定义和数组含义：这将是一个一维数组dp,dp[i]代表到达第i个房间时所持有的最大钱币数
// 2. 递推方法：dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i])
// 3. 初始化：dp[1] = num[0], dp[2] = Math.max(num[0],num[1])
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class rob_198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if(nums.length == 1){
            return dp[0];
        }
        dp[1] = Math.max(nums[0],nums[1]);

        if(nums.length == 2){
            return dp[1];
        }
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
