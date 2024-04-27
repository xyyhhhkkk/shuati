package daimasuixianglu.dynamicprogramming.zixulie;

import java.util.Arrays;

public class findLengthOfLCIS_674 {
    public static int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        int res = 1;
        //可以注意到，這邊的 i 是從 0 開始，所以會出現和卡哥的C++ code有差異的地方，在一些地方會看到有 i + 1 的偏移。
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                dp[i + 1] = dp[i] + 1;
            }
            res = res > dp[i + 1] ? res : dp[i + 1];
        }
        return res;
    }
}
