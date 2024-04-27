package daimasuixianglu.tanxin;

import java.util.Arrays;

public class largestSumAfterKNegations_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        while(k>0 && nums[index]<0){
            k--;
            nums[index] = -nums[index];
            index++;
            if(index>=nums.length){
                break;
            }
        }
        Arrays.sort(nums);
        while(k>0){
            k--;
            nums[0] = -nums[0];
        }
        return Arrays.stream(nums).sum();
    }

}
