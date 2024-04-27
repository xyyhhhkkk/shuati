package daimasuixianglu.tree;

public class isBalanced_110 {
    public boolean isBalanced(TreeNode root) {
        if(getheight(root) == -1){
            return false;
        }else return true;

    }
    public int getheight(TreeNode root){
        if(root == null) return 0;
        int leftheight = getheight(root.left);
        int rightheight = getheight(root.right);
        if (leftheight == -1) return -1;
        if (rightheight == -1) return -1;

        int result;
        if (Math.abs(rightheight-leftheight)>1) result = -1;
        else result = 1+Math.max(rightheight,leftheight);

        return result;
    }
}
