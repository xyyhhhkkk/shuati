package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3_216 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int sum = 0;
        combinationSum(n, k, sum, 1);
        return result;
    }

    public void combinationSum(int n, int k, int sum, int startindex){
        if(sum>n){
            return;
        }
        if(path.size() == k){
            if(n==sum){
                result.add(new ArrayList<>(path));
                return;
            }
        }
        for (int i = startindex; i <= 9-(k-path.size())+1; i++) {
            sum += i;
            path.add(i);
            combinationSum(n, k, sum, i+1);
            sum -= i;
            path.remove(path.size()-1);
        }
    }
}
