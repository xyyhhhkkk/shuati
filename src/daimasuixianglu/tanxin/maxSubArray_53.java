package daimasuixianglu.tanxin;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        int cnt = 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<cnt+nums[i]){
                cnt = cnt+nums[i];
            }
            else {
                cnt = nums[i];
            }
            if (cnt>result) result = cnt;
        }
        return result;
    }
}
