package recursion;

public class eightQueens {
    // 八皇后可以用一维数组来做, arr[i]表示在第i+1行的第arr[i]列
    public static void main(String[] args) {

        T t = new T();
        int[] arr = new int[8];
        t.putQueen(arr,0);
        System.out.println("八皇后问题一共有" + t.cnt +"情况");
    }


}
class T {
    int cnt = 0;
    public boolean verify(int[] arr, int row) {
        for (int i = 0; i < row; i++) {
            if (arr[i] == arr[row] || Math.abs(arr[row] - arr[i]) == Math.abs(row - i)) {
                return false;
            }
        }
        return true;
    }

    public void putQueen(int[] arr, int i) {

        // 先设置终止条件，这一步很关键
        if (verify(arr, 7)) {
            cnt++;
            System.out.println("第"+cnt+"种"+"————");
            array(arr);
        } else {
            for (int j = 0; j < 8; j++) {
                arr[i] = j;
                if (verify(arr, i)) {
                    putQueen(arr, i + 1);
                }
            }
        }
    }


    public void array(int[] arr) {

        char[][] arr1 = new char[arr.length][arr.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = '*';
                arr1[i][arr[i]] = 'Q';

                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();

        }
    }
}