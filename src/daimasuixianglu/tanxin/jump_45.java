package daimasuixianglu.tanxin;

public class jump_45 {
    public int jump(int[] nums) {
        if (nums==null||nums.length==0||nums.length==1){
            return 0;
        }
        int cur = 0;
        int next = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            next = Math.max(nums[i]+i,next);
            if (next>=nums.length-1){
                result++;
                break;
            }
            if (i==cur){
                cur = next;
                result++;
            }
        }
        return result;
    }
}
