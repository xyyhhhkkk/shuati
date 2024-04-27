package pdd;
// 这道题使用双指针来做（错误的想法）
// 这道题更像是一个巧妙的思想，偏向于动态规划，使用前缀和来做
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class treeSum_2021_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long cnt = 0;
        Map<Long,Long> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            long key = sum%m;
            map.put(key,map.getOrDefault(key, Long.valueOf(0))+1);
        }
        map.put(0L,map.getOrDefault(0, Long.valueOf(0))+1);
        for (long i:map.values()){
            cnt += i*(i-1)/2;
        }
        System.out.println(cnt);
    }
}
