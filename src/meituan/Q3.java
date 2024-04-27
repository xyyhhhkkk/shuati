package meituan;

import java.util.Scanner;

//小美拿到了一个排列，其中初始所有元素都是红色，但有一些元素被染成了白色。
//小美每次操作可以选择交换任意两个红色元素的位置。她希望操作尽可能少的次数使得数组变成非降序，你能帮帮她吗？
//排列是指：一个长度为n的数组，其中 1 到n每个元素恰好出现了一次
public class Q3 {
    //思路：首先将红色元素给拿出来，然后进行冒泡排序
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] isred = new boolean[n];
        String s = sc.next();
        char[] c= s.toCharArray();
        for (int i = 0; i < c.length; i++) {
        }
    }


    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
