package daimasuixianglu.dynamicprogramming.maimaigupiao;
// 五步法分析
// 1. 数组定义和数组含义：这将是一个二维数组, 其中dp[i][0]代表第i天持有该股票的最大利润，dp[i][1]代表第i天不持有该股票的最大利润。
// 2. 递推方法：第i天的持有和不持有都需要动规
// 3. 初始化：dp[0][0] = -price[0]; dp[0][1] = 0;
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class maxProfit_121 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][0]+prices[i],dp[i-1][1]);
        }
        return dp[prices.length-1][1];
    }
}
