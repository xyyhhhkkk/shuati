package daimasuixianglu.binaryTree;

public class isSymmetric_101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode left, TreeNode right){
        if(left == null && right != null) return false;
        else if (left != null && right == null) return false;
        else if (left == null && right == null) return true;
        else if(left.val != right.val) return false;
        else return compare(left.left,right.right) && compare(left.right,right.left);
    }
}
