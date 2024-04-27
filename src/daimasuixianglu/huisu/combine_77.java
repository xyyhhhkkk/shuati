package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class combine_77 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return result;
    }


    public void backtracking(int n, int k, int startindex){
        if(path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startindex; i <= n; i++) {
            path.add(i);
            backtracking(n, k, i+1);
            path.remove(path.size()-1);
        }
    }
}
