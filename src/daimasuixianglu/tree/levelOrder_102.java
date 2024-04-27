package daimasuixianglu.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 层序遍历的解题思路是使用队列
public class levelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null){
            q.offer(root);
        }
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            while(size-->0){
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
