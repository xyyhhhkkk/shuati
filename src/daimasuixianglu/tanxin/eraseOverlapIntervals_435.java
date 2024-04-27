package daimasuixianglu.tanxin;

import java.util.Arrays;
import java.util.Comparator;

public class eraseOverlapIntervals_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        int result = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]<intervals[i-1][1]){
                result++;
                intervals[i][1] = Math.min(intervals[i-1][1], intervals[i][1]);
            }
        }
        return result;
    }
}
