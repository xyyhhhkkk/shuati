package daimasuixianglu.binaryTree;

public class minDepth_111_postorder {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int leftheight = minDepth(root.left);
        int rightheight = minDepth(root.right);
        if(root.left == null && root.right != null){
            return rightheight+1;
        } else if (root.left != null && root.right == null) {
            return leftheight+1;
        }
        else return Math.min(leftheight,rightheight)+1;
    }
}
