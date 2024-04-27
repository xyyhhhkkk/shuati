package daimasuixianglu.tree;

//关于观察一个二叉树是否对称，应该使用的是后序遍历。、、
//定义inside和outside
//有三种情况返回false，一个是左空右不空，二是左不空右空，三是左右都不空但左右不相等
public class isSymmetric_101 {
    public boolean isSymmetric(TreeNode root) {
        return compare(root,root);
    }

    public boolean compare(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        }


        boolean inside = compare(left.right,right.left);
        boolean outside = compare(left.left,right.right);

        boolean result = inside && outside;
        return result;
    }

}
