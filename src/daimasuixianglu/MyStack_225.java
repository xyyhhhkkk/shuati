package daimasuixianglu;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MyStack_225 {
    Deque<Integer> q;
    public MyStack_225(){
        q = new LinkedList<Integer>();
    }
    public void push(int x){
        int n = q.size();
        q.push(x);
        for (int i = 0; i < n; i++) {
            q.push(q.pop());
        }
    }

    public int pop(){
        return q.pop();

    }

    public int top(){
        return q.peek();

    }
    public boolean empty(){
        return q.isEmpty();
    }
}
