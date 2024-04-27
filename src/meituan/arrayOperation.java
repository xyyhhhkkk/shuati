package meituan;

import java.util.Arrays;
import java.util.Scanner;

public class arrayOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(in.nextInt());
        }
        Arrays.sort(nums);
        System.out.println(numZero(nums,k));
    }
    public static int numZero(int[] nums,int k){
        int index = 0;
        int count = 0;
        while(k>0){
            if (nums[index]>0){
                nums[index]--;
                k--;
            }
            else if(nums[index]==0){
                index++;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count++;
            }
        }
        return count;
    }

}
