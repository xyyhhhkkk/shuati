package daimasuixianglu.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths_257 {
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        deal(root, "");
        return result;
    }

    public void deal(TreeNode node, String s){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            result.add(new StringBuilder(s).append(node.val).toString());
        }
        String tmp = new StringBuilder(s).append(node.val).append("->").toString();
        deal(node.left, tmp);
        deal(node.right, tmp);
    }
}
