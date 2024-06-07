package daimasuixianglu.hashmap;

import java.util.*;

public class fourSumCount_454 {
    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {-1, -2};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};
        System.out.println(fourSumCount(num1,num2,nums3,nums4));

    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> target1 = new HashMap<>();
        Map<Integer, Integer> target2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                target1.put(nums1[i]+nums2[j],target1.getOrDefault(nums1[i]+nums2[j],0)+1);
                target2.put(nums3[i]+nums4[j],target2.getOrDefault(nums3[i]+nums4[j],0)+1);
            }
        }
        System.out.println(target1);
        System.out.println(target2);

        int cnt = 0;
        for(Object key : target1.keySet()){
            int key1 = -(int) key;
            if (target2.containsKey(key1)){
                cnt+=target1.get(key)*target2.get(key1);
            }
        }
        return cnt;
    }
}
