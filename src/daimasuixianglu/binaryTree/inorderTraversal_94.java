package daimasuixianglu.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inter(root, res);
        return res;
    }
    public void inter(TreeNode root, List<Integer> res){
        if(root == null) return;
        inter(root.left, res);
        res.add(root.val);
        inter(root.right, res);
    }
}
