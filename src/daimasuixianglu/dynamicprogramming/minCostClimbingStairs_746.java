package daimasuixianglu.dynamicprogramming;
// 五步法分析
// 1. 数组定义和数组含义：这将是一个一维数组dp,dp[i]代表爬到i阶的最低花费数
// 2. 递推方法：dp[i] = min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2])
// 3. 初始化：dp[0] = 0, dp[1] = 0
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class minCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[dp.length-1];
    }
}
