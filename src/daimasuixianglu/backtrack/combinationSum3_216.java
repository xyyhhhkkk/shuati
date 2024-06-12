package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3_216 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(1,n,k);
        return result;
    }

    public void backtracking(int startindex, int n, int k){
        if (path.size() == k){
            if (n == 0) result.add(new ArrayList<>(path));
            else return;
        }
        for (int i = startindex; i < 10; i++) {
            path.add(i);
            n = n-i;
            backtracking(i+1, n, k);
            path.remove(path.size()-1);
            n = n+i;
        }
    }
}
