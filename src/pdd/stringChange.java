package pdd;
// 这道题卡了半天的原因就是输入端有错
import java.util.Arrays;
import java.util.Scanner;

public class stringChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        char[] arr1 = in.next().toCharArray();
        char[] arr2 = in.next().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            count += Math.abs(Integer.valueOf(arr1[i]) - Integer.valueOf(arr2[i]));
        }
        System.out.println(count);
    }
}
