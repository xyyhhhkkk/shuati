package daimasuixianglu;

import java.util.Stack;

public class evalRPN_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if(!tokens[i].equals("+")  && !tokens[i].equals('-') && !tokens[i].equals('*') && !tokens[i].equals('/')){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if(tokens[i].equals('+')){
                    stack.push(num1+num2);
                } else if (tokens[i].equals('-')){
                    stack.push(num1-num2);
                } else if (tokens[i].equals('*')){
                    stack.push(num1*num2);
                } else if (tokens[i].equals('/')){
                    stack.push(num1/num2);
                }
            }
        }
        return stack.pop();
    }
}
