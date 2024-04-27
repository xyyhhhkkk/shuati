package daimasuixianglu.tree;

public class sumOfLeftLeaves_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;

        int leftnum = sumOfLeftLeaves(root.left);
        if(root.left != null && root.left.left == null && root.left.right == null){
            leftnum = root.left.val;
        }
        int rightnum = sumOfLeftLeaves(root.right);
        int sum = leftnum+rightnum;
        return sum;

    }
}
