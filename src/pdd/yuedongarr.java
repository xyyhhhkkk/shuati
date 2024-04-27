package pdd;

import java.util.Arrays;
import java.util.Scanner;

public class yuedongarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < n-i; j++) {
                int t = i+j;
                System.out.println(i+" "+t);
                result+=count(Arrays.copyOfRange(arr,i,i+j+1));
            }
        }

        for (int i = 1; i < arr.length; i++) {

        }


        System.out.println(result);
    }

    public static int count(int[] arr){
        int cnt = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                cnt = 0;
                break;
            }
            else{
                cnt+=arr[i];
            }
        }
        return cnt;
    }
}
