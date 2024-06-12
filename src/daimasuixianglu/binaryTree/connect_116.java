package daimasuixianglu.binaryTree;


import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class connect_116 {
    public Node connect(Node root) {
        Queue<Node> que = new LinkedList<>();
        if(root == null) return root;
        que.add(root);

        while(!que.isEmpty()){
            int size = que.size() ;
            while(size > 1){
                Node node = que.remove();
                node.next = que.peek();
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                size--;
            }
        }
        return root;
    }
}
