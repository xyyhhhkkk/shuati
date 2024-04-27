package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solveNQueens_51_2 {
    List<List<String>> result = new ArrayList<>();
    List<Character> path = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] cheeseboard = new char[n][n];
        for(char[] c : cheeseboard){
            Arrays.fill(c,'.');
        }
        backtracking(cheeseboard,0,n);
        return result;
    }

    public void backtracking(char[][] cheeseboard, int row, int n){
        if(row == n){
            result.add(Array2List(cheeseboard));
            return;
        }

        for (int i = 0; i < n; i++) {
            if(isValid(row,i,cheeseboard,n)){
                cheeseboard[row][i] = 'Q';
                backtracking(cheeseboard,row+1,n);
                cheeseboard[row][i] = '.';
                //row--;
            }
        }
    }

    public boolean isValid(int row, int col, char[][] cheeseboard, int n){
        // 判断列
        for (int i = 0; i < n; i++) {
            if (cheeseboard[i][col] == 'Q'){
                return false;
            }
        }
        // 判断行
        for (int i = 0; i < n; i++) {
            if(cheeseboard[row][i] == 'Q'){
                return false;
            }
        }
        // 判断135度
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(cheeseboard[i][j] == 'Q'){
                return false;
            }
        }
        // 判断45度
        for (int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) {
            if (cheeseboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public List Array2List(char[][] chessboard) {
        List<String> list = new ArrayList<>();

        for (char[] c : chessboard) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }
}
