package daimasuixianglu.binaryTree;

import java.util.*;

public class levelOrderBottom_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = que.size();
            while(size>0){
                TreeNode node = que.remove();
                list.add(node.val);
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                size--;
            }
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }
}
