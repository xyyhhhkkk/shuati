package daimasuixianglu.string;

import java.util.Scanner;

public class reverseRightString_55 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        char[] arr = str.toCharArray();
        arr = reverse(arr,0,arr.length-1);
        arr = reverse(arr,0,1);
        arr = reverse(arr,2,arr.length-1);
        System.out.println(arr);
        }

    public static char[] reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
