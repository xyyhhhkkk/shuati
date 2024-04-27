package pdd;

import java.util.Scanner;

public class chocolate {
    static int[][][] s = new int[55][55][55];
    static int inf = 0x3f3f3f3f;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            System.out.println(count(n,m,k));
        }
    }
    public static int count(int n, int m, int k){
        if(n*m == k || k == 0){
            return 0;
        }
        if (n>m){
            int temp = n;
            n = m;
            m = temp;
        }
        if (s[n][m][k]>0){
            return s[n][m][k];
        }
        int smin = inf;
        for (int i = 1; i <= n/2; i++) {
            for (int j = 0; j <= k; j++) {
                int res = m*m + count(i,m,j) + count(n-i,m,k-j);
                smin = Math.min(smin,res);
            }
        }
        for (int i = 1; i <= m/2 ; i++) {
            for (int j = 0; j <= k; j++) {
                int res = n*n + count(i,n,j)+count(m-i,n,k-j);
                smin = Math.min(smin,res);
            }
        }
        return s[n][m][k] = smin;
    }
}
