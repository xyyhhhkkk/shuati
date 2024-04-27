package daimasuixianglu.dynamicprogramming.bianjijuli;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int cnt = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<cnt+nums[i]){
                cnt += nums[i];
            }
            else cnt = nums[i];
            res = Math.max(cnt, res);
        }
        return res;
    }
}
