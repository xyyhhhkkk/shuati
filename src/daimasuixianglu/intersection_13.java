package daimasuixianglu;

import java.util.HashSet;
import java.util.Set;

public class intersection_13 {
    public static void main(String[] args) {

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for(int num1:nums1){
            set1.add(num1);
        }

        for(int num2:nums2){
            set2.add(num2);
        }
        return getIntersection(set1,set2);
    }
    public static int[] getIntersection(Set<Integer> set1,Set<Integer> set2){
        Set<Integer> cnt = new HashSet<Integer>();
        if(set1.size()>set2.size()){
            return getIntersection(set2,set1);
        }
        for (int num : set1){
            if (set2.contains(num)){
                cnt.add(num);
            }
        }

        int[] intersection = new int[cnt.size()];
        int index = 0;
        for(int num : cnt){
            intersection[index++] = num;
        }
        return intersection;
    }
}
