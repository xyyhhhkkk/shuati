package daimasuixianglu.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findMinArrowShots_452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        int result = 1;
        int pos = points[0][1];
        for(int[] point: points){
            if (pos<point[0]){
                result++;
                pos = point[1];
            }
        }
        return result;
    }
}
