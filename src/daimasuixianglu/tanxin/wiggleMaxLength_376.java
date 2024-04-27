package daimasuixianglu.tanxin;

public class wiggleMaxLength_376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int prediff = 0;
        int curdiff = 0;
        int result = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            curdiff = nums[i+1] - nums[i];
            if((prediff<=0 && curdiff>0)||(prediff>=0 && curdiff<0)){
                result++;
                prediff = curdiff;
            }
        }
        return result;
    }
}
