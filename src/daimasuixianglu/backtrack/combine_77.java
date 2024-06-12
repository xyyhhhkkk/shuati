package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.List;

public class combine_77 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(1,k,n);
        return result;
    }

    public void backtracking(int startindex, int k, int n){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
            for (int i = startindex; i <= n-(k-path.size())+1; i++) {
                path.add(i);
                backtracking(i+1, k, n);
                path.remove(path.size()-1);
            }
    }
}
