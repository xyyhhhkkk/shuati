package daimasuixianglu.binaryTree;

import java.util.*;

public class largestValues_515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) return result;
        que.add(root);

        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode node = que.remove();
                list.add(node.val);
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                size--;
            }
            result.add(Collections.max(list));
        }
        return result;
    }
}
