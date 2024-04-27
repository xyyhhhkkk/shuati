package daimasuixianglu.dynamicprogramming.bianjijuli;

import java.util.Scanner;

public class numDistinct_115 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(numDistinct(s,t));
    }
    public static int numDistinct(String s, String t) {
        int lengthlong = s.length();
        int lengthshort = t.length();
        int[][] dp = new int[lengthlong+1][lengthshort+1];
        // 初始化
        for (int i = 0; i < lengthlong + 1; i++) {
            dp[i][0] = 1;
        }

        int result = 0;
        for (int i = 1; i < lengthlong + 1; i++) {
            for (int j = 1; j < lengthshort+1; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        printdp(dp);
        return dp[lengthlong][lengthshort];
    }
    public static void printdp(int[][] dp){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
