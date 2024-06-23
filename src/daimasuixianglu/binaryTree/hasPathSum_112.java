package daimasuixianglu.binaryTree;

public class hasPathSum_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        targetSum -= root.val;
        if(root.right == null && root.left == null && targetSum == 0){
            return true;
        }
        if (root.right == null && root.left == null && targetSum != 0){
            return false;
        }
        if(root.left != null){
            if(hasPathSum(root.left, targetSum)) return true;
        }
        if(root.right != null){
            if(hasPathSum(root.right, targetSum)) return true;
        }
        return false;
    }
}
