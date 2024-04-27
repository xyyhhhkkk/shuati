package daimasuixianglu.dynamicprogramming.zixulie;

public class lengthOfLIS_300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(dp[i]>dp[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int maxnum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxnum<dp[i]){
                maxnum = dp[i];
            }
        }
        return maxnum;
    }
}
