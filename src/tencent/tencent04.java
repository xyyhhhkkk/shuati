package tencent;

import java.util.Scanner;

public class tencent04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

    }
    public int XOR(int[] nums, int k){
        int n = nums.length;
        int[][] dp = new int[n+1][k+1];
        int[][] xor = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];

        for (int i = 0; i < n; i++) {
            xor[i][i] = nums[i-1];
            sum[i][i] = nums[i-1];
            for (int j = i+1; j <= n; j++) {
                xor[i][j] = xor[i][j-1]^nums[j-1];
                sum[i][j] = sum[i][j-1]^nums[j-1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = -1;
            }
        }
        dp[0][0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 0; l < i; l++) {
                    if (dp[l][j-1]!= -1){
                        dp[i][j] = Math.max(dp[i][j],dp[l][j-1]+(xor[l+1][i] ^ xor[l+1][i])+sum[l+1][i]);
                    }
                }
            }
        }
        int maxsum = 0;
        for (int j = 1; j <= k; j++) {
            maxsum = Math.max(maxsum,dp[n][j]);
        }
        return maxsum;
    }


}
