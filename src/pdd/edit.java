package pdd;

import java.util.Scanner;

public class edit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int maxscore = 0;
        int mincost = 0;

        int[] costpdd = new int[n];
        for (int i = 0; i < n; i++) {
            costpdd[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            int costp = cost(s.charAt(i-2),'P');
            int costd1 = cost(s.charAt(i-1),'D');
            int costd2 = cost(s.charAt(i),'D');
            costpdd[i] = costp+costd1+costd2;
        }

        int[][] dp = new int[n+1][n/3+1];

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= n/3; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i/3; j++) {
                if (dp[i][j] == Integer.MAX_VALUE){
                    continue;
                }
                dp[i+1][j] = Math.min(dp[i+1][j],dp[i][j]);

                if (i>=2 && dp[i-2][j] != Integer.MAX_VALUE){
                    dp[i+1][j+1] = Math.min(dp[i+1][j+1],dp[i-2][j]+costpdd[i]);
                }
            }
        }

        for (int i = 0; i <= n/3; i++) {
            if (dp[n][i] != Integer.MAX_VALUE){
                if(i>maxscore){
                    maxscore = i;
                    mincost = dp[n][i];
                }
                else if (i == maxscore){
                    mincost = Math.min(mincost,dp[n][i]);
                }
            }
        }
        System.out.println(maxscore+' '+mincost);
    }

    public static int cost(char c1, char c2){
        return Math.abs(c1-c2);
    }
}
