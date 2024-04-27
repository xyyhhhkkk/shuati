import java.util.Arrays;
import java.util.Scanner;

public class wangyi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] p = n.split(" ");
        String[] sp = p[0].split(",");
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(sp[i]);
        }

        String s = p[p.length-2]; //字符
        int d = Integer.parseInt(p[p.length-1]); //非负整数
        System.out.println("nums"+ Arrays.toString(nums));
        System.out.println("s" + s);
        System.out.println("d" +d);
        System.out.println(distance(nums,s,d));
    }

    public static int distance(int[] nums, String s, int d){
        int n = nums.length;
        long[] pos = new long[n];
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='L'){
                pos[i] = (long) nums[i] - d;
            }
            else {
                pos[i] = (long) nums[i] + d;
            }
        }
        Arrays.sort(pos);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += 1L * (pos[i] - pos[i-1] * i % 1000000007 * (n-i) %1000000007);
            res %= 1000000007;
        }
        return(int) res;
    }
}
