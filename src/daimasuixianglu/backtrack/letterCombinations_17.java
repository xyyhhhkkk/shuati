package daimasuixianglu.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombinations_17 {
    List<String> result = new ArrayList<>();
    String path = new String();
    Map<String,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        backtrack(digits,0);
        return  result;
    }

    public void backtrack(String digits, int n){
        if(n == digits.length()){
            result.add(new String(path));
            return;
        }
        String temp = String.valueOf(digits.charAt(n));

        for (int i = 0; i < map.get(temp).length(); i++) {
            path += map.get(temp).charAt(i);
            backtrack(digits,n+1);
            path.substring(0,path.length()-1);
        }
    }
}
