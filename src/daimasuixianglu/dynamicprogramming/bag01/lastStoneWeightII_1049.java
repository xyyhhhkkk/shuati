package daimasuixianglu.dynamicprogramming.bag01;

import java.util.Arrays;

// 五步法分析
// 1. 数组定义和数组含义：这将是一个一维数组dp,dp[i]代表背包装了i重量的东西后的最大价值
// 2. 递推方法：dp[i+cost] = max(dp[i+cost]+value,dp[i])
// 3. 初始化：dp[0] = 0
// 4. 遍历顺序：从前往后，因为后面的数组值需要由前面的数组值得到
// 5. 打印dp：纠错
// 0.1 如何计算：
// 我们可以先求出这一堆石头的总质量sum，
// 而sum = heap1 + heap2    （heap1 > heap2）
// heap1 - heap2 = sum - 2 * heap2
// 要求heap1 - heap2 的最小值，就可以转化成求sum - 2 * heap2 的最小值，
// 也就转化成了求 2 * heap2 的最大值，也就是求heap2的最大值（前提：sum - 2 * heap2 >= 0 等价于 heap2 <= sum / 2）
// 那么就转化成了01背包问题：背包的最大容量为 sum / 2
public class lastStoneWeightII_1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum();
        sum = sum/2;
        int[] dp = new int[sum+1];
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < stones.length; i++) {
            for (int j = sum; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return Math.abs(Arrays.stream(stones).sum() - dp[sum]*2);
    }
}
