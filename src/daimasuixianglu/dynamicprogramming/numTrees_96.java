package daimasuixianglu.dynamicprogramming;
// 五步法分析
// 1. 数组定义和数组含义：这将是一个一维数组dp,dp[i]代表i个结点有多少种二叉搜索树
// 2. 递推方法：dp[i] += dp[j-1]+dp[i-j]
// 3. 初始化：dp[0] = 1, dp[1] = 1,dp[2] = 1.这道题甚至可以不用初始化
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class numTrees_96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
