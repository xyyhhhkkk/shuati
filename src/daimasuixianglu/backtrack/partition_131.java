package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.List;

public class partition_131 {
    List<List<String>> result = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return result;
    }
    public void backtracking(String s, int startindex){
        if(startindex>=s.length()){
             result.add(new ArrayList<>(path));
        }
        for (int i = startindex; i < s.length(); i++) {
            if(isPar(s.substring(startindex,i+1))){
                path.add(s.substring(startindex,i+1));
                backtracking(s,i+1);
                path.remove(path.size()-1);
            }
        }

    }

    public boolean isPar(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if (s.charAt(left) != s.charAt(right)) return false;
            left ++;
            right --;
        }
        return true;
    }
}
