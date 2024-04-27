package daimasuixianglu.tanxin;

import java.util.*;

public class reconstructQueue_406 {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]){
                    return o2[0] - o1[0];
                }else {
                    return o1[1] - o2[1];
                }
            }
        });
        List<int[]> result = new ArrayList<>();
        for (int[] person:people){
            result.add(person[1],person);
        }
        return result.toArray(new int[result.size()][]);
    }
}
