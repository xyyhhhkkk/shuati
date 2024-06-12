package daimasuixianglu.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = que.size();
            while(size>0){
                TreeNode node = que.remove();
                list.add(node.val);
                if(node.right != null) que.add(node.right);
                if(node.left != null) que.add(node.left);
                size--;
            }
            result.add(list);
        }
        return result;
    }
}
