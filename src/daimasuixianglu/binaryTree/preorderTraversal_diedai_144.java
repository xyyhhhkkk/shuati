package daimasuixianglu.binaryTree;

import daimasuixianglu.linkedList.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal_diedai_144 {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return res;

        stack.push(root);
        while(stack != null){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
        return res;
    }
}
