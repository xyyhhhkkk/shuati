package daimasuixianglu;

import java.util.Deque;
import java.util.LinkedList;

// 解题思路：这道题使用队列来做，每进够k个值，使用单调队列
public class maxSlidingWindow_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        if(nums.length == 0 || k == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];

        for(int i = 0; i<nums.length;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(dq.peek() <= i-k){
                dq.poll();
            }
            if (i+1>=k){
                res[i+1-k] = nums[dq.peek()];
            }
        }
        return res;
    }

}
