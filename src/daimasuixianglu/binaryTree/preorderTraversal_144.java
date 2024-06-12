package daimasuixianglu.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        pre(root,res);
        return res;
    }

    public void pre(TreeNode root, List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        pre(root.left, res);
        pre(root.right, res);
    }
}
