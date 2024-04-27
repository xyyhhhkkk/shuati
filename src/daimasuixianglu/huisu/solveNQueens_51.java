package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class solveNQueens_51 {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for(char[] c:chessboard){
            Arrays.fill(c,'.');
        }
        backtracking(n,chessboard,0);
        return result;
    }

    public void backtracking(int n, char[][] cheeseBoard, int row){
        if (row == n){
            result.add(Array2List(cheeseBoard));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row,col,n,cheeseBoard)){
                cheeseBoard[row][col] = 'Q';
                backtracking(n,cheeseBoard,row+1);
                cheeseBoard[row][col] = '.';
            }
        }
    }

    public List Array2List(char[][] cheeseboard){
        List<String> list = new ArrayList<>();

        for (char[] c : cheeseboard){
            list.add(String.copyValueOf(c));
        }
        return list;
    }

    public boolean isValid(int row, int col, int n, char[][] chessboard){
        //检查列
        for (int i = 0; i < row; i++) {
            if(chessboard[i][col] == 'Q' ){
                return false;
            }
        }
        //检查45度对角线
        for (int i = row-1, j = col-1; i >= 0 && j>=0 ; i--,j--) {
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }
        //检查135度对角线
        for (int i = row-1, j=col+1; i >= 0 && j<=n-1; i--,j++) {
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

}
