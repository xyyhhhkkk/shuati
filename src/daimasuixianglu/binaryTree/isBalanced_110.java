package daimasuixianglu.binaryTree;

public class isBalanced_110 {
    public boolean isBalanced(TreeNode root) {
        if(getheight(root)==-1) return false;
        return true;
    }

    public int getheight(TreeNode root){
        if(root == null) return 0;
        int leftheight = getheight(root.left);
        int rightheight = getheight(root.right);
        if(leftheight == -1) return -1;
        if(rightheight == -1) return  -1;

        if(Math.abs(leftheight-rightheight)>1) return -1;
        else return Math.max(leftheight,rightheight)+1;
    }
}
