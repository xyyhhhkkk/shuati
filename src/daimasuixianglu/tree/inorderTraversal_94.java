package daimasuixianglu.tree;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal_94 {
    public void inorderTraversal(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        inorderTraversal(root.left,res);
        res.add(root.val);
        inorderTraversal(root.right,res);

    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        inorderTraversal(root,res);
        return res;
    }
}
