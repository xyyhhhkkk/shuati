package recursion;

public class MiGong {
    public static void main(String[] args) {
        int[][] map = createMiGong(8,7);
        // 其次0表示可以走，1表示存在障碍物
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

        findWay(map, 1, 1);
        for (int i = 0; i < 7; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print(map[i][j]+" ");
            }
        }




    }

    // 首先创建迷宫，使用一个二维数组。 int[][] map = new int[8][7]

    public static int[][] createMiGong(int row, int column){
        return new int[row][column];
    }

    // 寻找迷宫路径,因为要递归，所以函数返回值是boolean类型
    public static boolean findWay(int[][] arr, int i, int j){
        // 其中0表示没有走过且可以走，1表示此路不通，2表示可以走但走过，3表示试过但不通
        // i表示出发的行，j表示出发的列
        // 第一步要判断是否到达了终点
        if(arr[5][4] == 2){
            return true;
        }
        else{
            if (arr[i][j] == 0){
                arr[i][j] = 2;
                if(findWay(arr,i+1,j)){
                    return true;
                } else if (findWay(arr,i,j+1)) {
                    return true;
                } else if (findWay(arr, i-1,j)) {
                    return true;
                } else if (findWay(arr,i,j-1)) {
                    return true;
                }
                else {
                    arr[i][j] = 3;
                    return false;
                }
            }
            else return false;
        }

    }
}
