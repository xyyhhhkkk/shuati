package daimasuixianglu.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class invertTree_226_bfs {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(! que.isEmpty()){
            int size = que.size();
            while(size>0){
                TreeNode node = que.remove();
                swap(node);
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                size --;
            }
        }
        return root;
    }
    public void swap(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
