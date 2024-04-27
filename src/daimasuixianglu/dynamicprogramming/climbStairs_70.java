package daimasuixianglu.dynamicprogramming;
// 这道题可以用 递归 也可以用 动态规划。这里只使用了动态规划
// 五步法分析
// 1. 数组定义和数组含义：这将是一个一维数组dp,dp[i]代表爬到i阶的方法数
// 2. 递推方法：dp[i] = dp[i-1]+dp[i-2]
// 3. 初始化：dp[1] = 1, dp[2] = 1
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class climbStairs_70 {

    public int climbStairs(int n) {
        if(n==1||n==0){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
