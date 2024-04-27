package pdd;

import java.util.Scanner;

public class stringedit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int maxscore = 0;
        int minCost = Integer.MAX_VALUE;

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

            }
        }



        System.out.println(s.contains("PDD"));
        char[] arr = s.toCharArray();
        int PDDcnt = (int)'P'+(int)'D'+(int)'D';
        int score = n/3;
        int arrcnt = 0;
        int resultcost = 0;
        //思路，如果能除尽，就去按顺序遍历变化成PDD
        //如果不能除尽3，就说明要有需要丢弃的字母，而这些字母位数只能是n%3+3,直到小于n
        //第一种情况，可以除尽
        for (int i = 0; i < n; i++) {
            arrcnt += (int) arr[i];
        }
        System.out.println(Math.abs(arrcnt-PDDcnt*score));
        //第二种情况，不可以除尽,这个时候只能去找
        int restnum = n%3;
        while(restnum<n){

        }
        for (int i = 0; i < n; i++) {

        }
    }

    public static int cost(char[] arr,int score){
        int PDDcnt = (int)'P'+(int)'D'+(int)'D';
        //因为要取得最大得分，所以score是确定了
        int arrcnt = 0;
        for (int i = 0; i < arr.length; i++) {
            arrcnt += (int) arr[i];
        }
        int diff = PDDcnt*score;
        return 0;
    }
}
