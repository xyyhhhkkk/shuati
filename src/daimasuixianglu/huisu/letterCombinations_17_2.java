package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombinations_17_2 {
    static List<String> result = new ArrayList<>();
    static String path = "";
    static Map<String,String> map = new HashMap<>();
    String digits = "2";

    public static void main(String[] args) {
        System.out.println(result);
    }
    public static List<String> letterCombinations(String digits) {
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        if (digits.length()==0){
            return result;
        }
        backtracking(digits,0);
        return result;
    }

    public static void backtracking(String digits,int num){
        if (path.length() == digits.length()){
            result.add(new String(path));
            return;
        }
            String temp = String.valueOf(digits.charAt(num));
            for (int j = 0; j < map.get(temp).length(); j++) {
                path += map.get(temp).charAt(j);
                backtracking(digits,num+1);
                path = path.substring(0,path.length()-1);
            }
    }
}
