package daimasuixianglu.tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import daimasuixianglu.tree.TreeNode;
public class preorderTraversal_144 {
    // 第一种写法：前序遍历的递归写法
    public void preorderTraversal(TreeNode root,List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preorderTraversal(root.left,res);
        preorderTraversal(root.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        preorderTraversal(root,res);
        return res;
    }

    // 第二种写法：前序遍历的非递归写法，即迭代写法，中左右
    public static List<Integer> preOrderIteration(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        stack.offer(root);
        while(!stack.isEmpty() || node != null){
            while(node != null){
                res.add(node.val);
                stack.offer(node);
                node = node.left;
            }
            node = stack.poll();
            node = node.right;
        }
        return res;
    }


}
