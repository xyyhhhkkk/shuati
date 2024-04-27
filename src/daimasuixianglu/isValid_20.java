package daimasuixianglu;

import java.util.Stack;

public class isValid_20 {
    //这道题的思路是排除三种不符合的情况
    // 一是左符号超过了
    // 二是右符号超过了
    // 三是左右符号不匹配

    public boolean isValid(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (s.charAt(i) == '('){
                stack.push(')');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            }
            if(s.charAt(i) == ')'|| s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!= s.charAt(i)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
