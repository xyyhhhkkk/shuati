package daimasuixianglu.binaryTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};
    TreeNode(int val){
        this.val = val;
    }

    TreeNode(TreeNode left, TreeNode right, int val){
        this.left = left;
        this.right = right;
        this.val = val;
    }
}
