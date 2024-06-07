package daimasuixianglu.array;

import java.util.Random;

public class randomArraySolution {
    public static void main(String[] args) {

        int size = 10;
        int[] arr = generateRandomArray(size);
        reverseArray(arr);
        System.out.println("平均值是"+avgArray(arr));
        System.out.println("最大值是"+maxIndex(arr));
        System.out.println("最小值是"+minIndex(arr));

    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rs = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rs.nextInt(100);
        }
        return arr;
    }

    public static double avgArray(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int maxIndex(int arr[]) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                index = i;
                max = arr[i];
            }
        }
        return index;
    }

    public static int minIndex(int arr[]) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                index = i;
                min = arr[i];
            }
        }
        return index;
    }

    public static void reverseArray(int arr[]) {
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}