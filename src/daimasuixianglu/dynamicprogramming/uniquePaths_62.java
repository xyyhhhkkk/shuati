package daimasuixianglu.dynamicprogramming;
// 五步法分析
// 1. 数组定义和数组含义：这将是一个二维数组dp[i][j]代表走到第i行第j列的路径数
// 2. 递推方法：dp[i][j] = dp[i-1][j]+dp[i][j-1]
// 3. 初始化：dp[0][j] = 1, dp[i][0] = 1
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class uniquePaths_62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
