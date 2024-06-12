package daimasuixianglu.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class maxDepth_104 {
    public int maxDepth(TreeNode root) {
        int result = 0;
        if(root == null) return result;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(! que.isEmpty()){
            int size = que.size();
            while(size>0) {
                TreeNode node = que.remove();
                if (node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
                size--;
            }
            result++;
        }
        return result;
    }
}
