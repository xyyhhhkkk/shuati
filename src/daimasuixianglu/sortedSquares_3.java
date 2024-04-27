package daimasuixianglu;

//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序排序。
//平方后的数组一定是两边大，中间小，采用双指针，一左一右往中间移动
//思路总结，首先是声明一个result数组来存储平方后的整数们。然后是根据两边大中间小的原则，指针一左一右，for循环的与众不同需要铭记。
public class sortedSquares_3 {
    public static void main(String[] args) {

    }
    public static int[] sortedSquares(int[] nums) {
        int k = nums.length-1;
        int[] result = new int[k+1];
        for(int i = 0, j = nums.length-1; i<=j; ){
            if(nums[i]*nums[i]<nums[j]*nums[j]){
                result[k] = nums[j]*nums[j];
                j--;
            }else{
                result[k] = nums[i]*nums[i];
                i++;
            }
            k--;
        }
        return result;
    }
}
