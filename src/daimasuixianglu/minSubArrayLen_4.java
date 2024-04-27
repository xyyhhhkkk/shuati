package daimasuixianglu;
// 给定一个含有 n 个正整数的数组和一个正整数 target 。
//找出该数组中满足其总和大于等于 target 的长度最小的连续子数组
// [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
// 解题思路关键：为了避免暴力解法嵌套双层for循环，这里使用双指针，其中j是终止指针，i是初始指针。while循环是一直都要的，然后来不断替换
//最小len的值，直到遍历完整个数组，返回len的值。
public class minSubArrayLen_4 {
    public static void main(String[] args) {

    }
    public static int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int i = 0;
        int len = Integer.MAX_VALUE;
        for (int j = 0; j<=nums.length-1; j++){
            sum += nums[j];
            while(sum>=s){
                sum -= nums[i];
                len = Math.min(len,j-i+1);
                i++;
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}
