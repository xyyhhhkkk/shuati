package daimasuixianglu.dynamicprogramming.bag01;

import java.util.Arrays;

// 五步法分析
// 1. 数组定义和数组含义：这将是一个一维数组dp,dp[i]代表背包装了i重量的东西后的最大价值
// 2. 递推方法：dp[i+cost] = max(dp[i+cost]+value,dp[i])
// 3. 初始化：dp[0] = 0
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
public class bag0And1 {
    public static void main(String[] args) {
        int volume = 4;
        int[] cost = new int[]{1,3,4};
        int[] value = new int[]{15,20,30};
        int[] dp = new int[5];

        for (int i = 0; i < cost.length; i++) {
            for (int j = volume; j >= cost[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j-cost[i]]+value[i]);
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
