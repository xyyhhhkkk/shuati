package daimasuixianglu.binaryTree;

public class countNodes_222 {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
