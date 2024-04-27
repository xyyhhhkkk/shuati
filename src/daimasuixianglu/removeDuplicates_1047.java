package daimasuixianglu;

import java.util.Stack;

public class removeDuplicates_1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            if(stack.isEmpty() || stack.peek() != s.charAt(i)){
                stack.push(s.charAt(i));
            } else if (stack.peek() == s.charAt(i)) {
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}
