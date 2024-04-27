package meituan;

import java.util.Scanner;

//小美拿到了一个n行m列的矩阵，她想知道该矩阵有多少个 2*2 的子矩形满足 1 和 0 的数量相等？
//第一行输入两个正整数n,m用空格隔开。
//        接下来的n行，每行输入一个长度为m的 01 串，用来表示矩阵。
//        2<=n,m<=100
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(SearchFor2matrix(arr));
    }
    public static int SearchFor2matrix(int[][] arr){
        int cnt = 0;
        int cnt0 = 0;
        int cnt1 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                if(arr[i][j]==1){
                    cnt1++;
                }else cnt0++;
                if(arr[i][j+1]==1){
                    cnt1++;
                }else cnt0++;
                if(arr[i+1][j]==1){
                    cnt1++;
                }else cnt0++;
                if(arr[i+1][j+1]==1){
                    cnt1++;
                }else cnt0++;
                if(cnt0==cnt1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
