package daimasuixianglu.tree;
// 求二叉树最大深度的思路是采用后序遍历
// 当root是null的时候，return 0，其他时候return num+1
public class maxDepth_104 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftheight = maxDepth(root.left);
        int rightheight = maxDepth(root.right);
        int height = 1+Math.max(leftheight,rightheight);
        return height;
    }
}
