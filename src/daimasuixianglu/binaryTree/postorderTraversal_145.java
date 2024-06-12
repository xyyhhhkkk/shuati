package daimasuixianglu.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class postorderTraversal_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        post(root,res);
        return res;
    }

    public void post(TreeNode root, List<Integer> res){
        if(root == null) return;
        post(root.left,res);
        post(root.right,res);
        res.add(root.val);
    }
}
