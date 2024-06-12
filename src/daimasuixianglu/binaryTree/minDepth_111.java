package daimasuixianglu.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class minDepth_111 {
    public int minDepth(TreeNode root) {
        int result = 0;
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            while(size>0){
                TreeNode node = que.remove();
                if(node.right == null && node.left == null) return result;
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                size--;
            }
            result++;

        }
        return result;
    }
}
