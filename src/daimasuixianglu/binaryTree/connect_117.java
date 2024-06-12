package daimasuixianglu.binaryTree;


import java.util.LinkedList;
import java.util.Queue;

public class connect_117 {
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
