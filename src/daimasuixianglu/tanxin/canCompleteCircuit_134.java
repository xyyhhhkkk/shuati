package daimasuixianglu.tanxin;

import java.util.Arrays;

public class canCompleteCircuit_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) return -1;
        int n = gas.length;
        int[] total = new int[n * 2];
        for (int i = 0; i < n; i++) {
            total[i] = gas[i] - cost[i];
            total[i + n] = gas[i] - cost[i];
        }
        int start = 0;
        int sum = 0;
        for (int i = 0; i < n * 2; i++) {
            sum += total[i];
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }
        return start < n ? start : -1;
    }
}
