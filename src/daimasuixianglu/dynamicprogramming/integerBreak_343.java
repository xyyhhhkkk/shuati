package daimasuixianglu.dynamicprogramming;
// 五步法分析
// 1. 数组定义和数组含义：这将是一个一维数组dp,dp[i]代表整数i拆分后的最大乘积
// 2. 递推方法：dp[i] = max(j*dp[i-j],j*(i-j),dp[i])
// 3. 初始化：dp[0] = 0, dp[1] = 0,dp[2] = 1.这道题甚至可以不用初始化
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class integerBreak_343 {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(Math.max(j*dp[i-j],j*(i-j)),dp[i]);
            }
        }
        return dp[n];
    }
}
