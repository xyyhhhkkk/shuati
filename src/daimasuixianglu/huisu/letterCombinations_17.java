package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations_17 {
    String[] str = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<StringBuilder> result = new ArrayList<>();
    StringBuilder s = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        backtrackString(digits,0);
        List<String> stringList = new ArrayList<>();
        for (StringBuilder sb : result) {
            stringList.add(sb.toString());
        }
        return stringList;
    }
    public void backtrackString(String digits, int index){
        if(index == digits.length()){
            result.add(s);
            return;
        }
        int digit = Integer.parseInt(String.valueOf(digits.charAt(index)));
        String letter = str[digit];
        for (int i = 0; i < letter.length(); i++) {
            s.append(letter.charAt(i));
            backtrackString(digits, index+1);
            s.deleteCharAt(s.length()-1);
        }
    }

}
