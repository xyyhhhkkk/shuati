package daimasuixianglu;
//常规数组删除某个元素是使用双层for循环暴力解法
//优化解法是使用双指针，快慢指针，read指针和write指针
public class removeElement_2 {
    public static void main(String[] args) {

    }
    public static int removeElement(int[] nums,int val){
        int slow = 0;
        for (int fast = 0; fast<nums.length; fast++){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
