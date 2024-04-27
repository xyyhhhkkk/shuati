package daimasuixianglu.tree;
//解题思路：完全二叉树的节点个数是不确定的，满二叉树的节点个数是确定的。
//因此这道题的解题思路是找到存在的满二叉树子树，计算出其节点个数，然后把左右子树的节点总和加起来。
public class countNodes_222 {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int leftdepth = 0;
        int rightdepth = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;

        while(left != null){
            left = left.left;
            leftdepth++;
        }

        while(right != null){
            right = right.right;
            rightdepth++;
        }
        if (leftdepth == rightdepth) return (int) (Math.pow(2,leftdepth+1)-1);

        int leftnum = countNodes(root.left);
        int rightnum = countNodes(root.right);
        return leftnum+rightnum+1;
    }
}
