package daimasuixianglu.tree;

import java.util.ArrayList;
import java.util.List;

public class postorderTraversal_145 {
    public void postorderTraversal(TreeNode root,List<Integer> res) {
        if(root == null){
            return;
        }
        postorderTraversal(root.left,res);
        postorderTraversal(root.right,res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        postorderTraversal(root,res);
        return res;
    }
}
