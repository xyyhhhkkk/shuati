package mayi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*小笨有一个长度为n的数组，
他想将数组中的一部分数字染黑，其他数字染白，
使得所有黑色数字的和是A的倍数，所有白色数字的和是B的倍数。
如果数组所有元素都被涂成黑色，则白色数字加和视为0，反之，黑色同理。
想知道有多少种染色方案。输入：第一行三个整数1<=n<=40。第二行n个整数ai，表示数组a。
输出为方案的个数。请为他写java代码*/
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(combinationSum(arr,a,b));
    }
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int targeta, int targetb) {
        int sum = 0;
        for (int i = 0; i < candidates.length; i++) {
            sum+=candidates[i];
        }
        backtracking(candidates,targeta,targetb,0,0,sum);
        return result;
    }

    public static void backtracking(int[] candidate, int targeta, int targetb,int suma,int startindex,int sum){
        if (suma%targeta == 0 && (sum-suma)%targetb == 0){
            result.add(new ArrayList<>(path));
        }
        for (int i = startindex; i < candidate.length; i++) {
                path.add(candidate[i]);
                backtracking(candidate,targeta,targetb,suma+candidate[i],i+1,sum);
                path.remove(path.size()-1);

        }
    }
}
