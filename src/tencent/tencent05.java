package tencent;

public class tencent05 {
    private static final int[][] Directions = {{0,1},{0,-1},{1,0},{-1,0}};
    private static final String TARGET = "tencent";
    private int cnt = 0;
    public static void main(String[] args) {


    }
//    public int dfs(char[][] matrix, int i, int j, int step, int targetindex){
//        if (step>6 || targetindex>=TARGET.length()){
//            return 0;
//        }
//        if(i<0 || j<0 ||i>=matrix.length||j>=matrix.length||matrix[i][j] != TARGET.charAt(targetindex)){
//            return 0;
//        }
//        if (targetindex == TARGET.length()-1){
//            cnt++;
//            return cnt;
//        }
//        int temp = cnt;
//        for (int[] direction: Directions){
//            cnt = dfs(matrix,i+direction[0],j+direction[1],step+1,targetindex+1,)
//        }
//    }
}
