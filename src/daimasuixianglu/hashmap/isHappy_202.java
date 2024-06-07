package daimasuixianglu.hashmap;

import java.util.HashSet;
import java.util.Set;

public class isHappy_202 {
    public static void main(String[] args) {
        isHappy(19);
    }

    public static boolean isHappy(int n) {
        int num = n;
        Set<Integer> set = new HashSet<>();
        while(num != 1){
            int len = String.valueOf(num).length();
            int temp = 0;
            for (int i = 0; i < len; i++) {
                temp += Math.pow(Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i))),2);
            }
            num = temp;
            System.out.println(temp);
            if (set.contains(num)) return false;
            set.add(num);
        }
        return true;
    }
}
