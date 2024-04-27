package debug;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1,-1,10,-20,100};
        //在Arrays.sort()打断点，来判断该方法的底层实现，这个时候不要用step over，要使用进入方法体
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

}
