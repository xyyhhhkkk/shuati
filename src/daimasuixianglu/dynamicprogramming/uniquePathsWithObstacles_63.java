package daimasuixianglu.dynamicprogramming;
// 五步法分析
// 1. 数组定义和数组含义：这将是一个二维数组dp[i][j]代表走到第i行第j列的路径数
// 2. 递推方法：dp[i][j] = dp[i-1][j]+dp[i][j-1]
// 3. 初始化：dp[0][j] = 1, dp[i][0] = 1, 注意遇到障碍物时dp[i][j]变成0
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class uniquePathsWithObstacles_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];

        if(obstacleGrid[0][0] == 1) return 0;

        for (int i = 0; i < row; i++) {
            if (! isOb(i,0,obstacleGrid)){
                dp[i][0] = 0;
                break;
            }
            else dp[i][0] = 1;
        }

        for (int i = 0; i < col; i++) {
            if (! isOb(0,i,obstacleGrid)){
                dp[0][i] = 0;
                break;
            }
            else dp[0][i] = 1;
        }


        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(isOb(i,j,obstacleGrid)){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return dp[row-1][col-1];
    }

    public static boolean isOb(int i, int j, int[][] obstacleGrid){
        if (obstacleGrid[i][j] == 1){
            return false;
        }
        return true;
    }
}
