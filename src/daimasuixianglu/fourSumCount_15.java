package daimasuixianglu;

import java.util.HashMap;
import java.util.Map;

public class fourSumCount_15 {
    public static void main(String[] args) {

    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int cnt = 0;
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                hashmap.put(nums1[i]+nums2[j],hashmap.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                if(hashmap.containsKey(-(nums3[i]+nums4[j]))){
                    cnt += hashmap.get(nums3[i]+nums4[j]);
                }
            }
        }
        return cnt;
    }

}
