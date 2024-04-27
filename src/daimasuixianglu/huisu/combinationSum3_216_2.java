package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum3_216_2 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k,n,1);
        return result;
    }

    public void backtracking(int k, int n, int startindex){
        if (path.size()==k && n == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startindex; i < 10; i++) {
            path.add(i);
            backtracking(k,n-i,i+1);
            path.remove(path.size()-1);
        }
    }
}
