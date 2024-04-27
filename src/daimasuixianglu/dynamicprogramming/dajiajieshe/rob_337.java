package daimasuixianglu.dynamicprogramming.dajiajieshe;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class rob_337 {
    public int rob(TreeNode root) {
        int[] res = robAction1(root);
        return Math.max(res[0],res[1]);
    }

    int[] robAction1(TreeNode root){
        int res[] = new int[2];
        //res[0] 表示不取这个节点值的最大值
        //res[1] 表示取这个节点值的最大值
        if(root == null){
            return res;
        }

        int[] left = robAction1(root.left);
        int[] right = robAction1(root.right);

        res[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        res[1] = root.val + left[0] + right[0];
        return res;
    }
}
