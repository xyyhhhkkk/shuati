package daimasuixianglu;

import java.util.Scanner;


public class binarySearch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    //第一种：区间是左闭右闭
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<target){
                left = mid + 1;
            }
            else if(arr[mid]>target){
                right = mid - 1;
            }else return mid;
        }
        return -1;
    }
    //第二种：区间是左闭右开
    public static int binarySearch2(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]<target){
                left = mid+1;
            }
            else if(arr[mid]>target){
                right = mid;
            }else return mid;
        }
        return -1;
    }
}
