package daimasuixianglu.binaryTree;

public class constructMaximumBinaryTree_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums,0,nums.length);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int start, int end){
        if(end-start<1) return null;
        if(end-start == 1) return new TreeNode(nums[start]);

        int maxindex = start;
        int maxvalue = nums[maxindex];
        for (int i = start+1; i < end; i++) {
            if(nums[i]>maxvalue){
                maxvalue = nums[i];
                maxindex = i;
            }
        }
        TreeNode root = new TreeNode(maxvalue);
        root.left = constructMaximumBinaryTree(nums,start,maxindex);
        root.right = constructMaximumBinaryTree(nums,maxindex+1,end);
        return root;
    }
}
