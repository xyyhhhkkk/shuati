package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

public class partition_131 {
    List<List<String>> result = new ArrayList<>();
    List<String> path = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return result;
    }

    public void backtracking(String str, int startindex) {
        if (startindex >= str.length()) {
            result.add(new ArrayList<>(path));
            return;
        } else {
            for (int i = startindex; i < str.length(); i++) {
                String temp = str.substring(startindex, i + 1);
                if (isStr(temp)) {
                    path.add(temp);
                } else
                    continue;
                backtracking(str, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean isStr(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        if (reversed.equals(s)) {
            return true;
        } else
            return false;
    }
}
