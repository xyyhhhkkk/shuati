package daimasuixianglu.tanxin;

import java.util.Arrays;

public class candy_135 {
    public int candy(int[] ratings) {
        int[] num = new int[ratings.length];
        Arrays.fill(num, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i-1]<ratings[i]){
                num[i] = num[i-1]+1;
            }
        }
        for (int i = ratings.length-1; i >0 ; i--) {
            if (ratings[i]<ratings[i-1]){
                num[i-1] = Math.max(num[i]+1,num[i-1]);
            }
        }
        return Arrays.stream(num).sum();
    }
}
