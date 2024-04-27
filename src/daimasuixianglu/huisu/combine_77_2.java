package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

public class combine_77_2 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return result;
    }

    public void backtracking(int n, int k, int startindex){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int j = startindex; j < n+1; j++) {
            path.add(j);
            backtracking(n,k,j+1);
            path.remove(path.size()-1);
        }
    }
}
