package daimasuixianglu.binaryTree;

import java.util.*;

public class averageOfLevels_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = que.size();
            while (size > 0) {
                TreeNode node = que.remove();
                list.add(node.val);
                if (node.right != null) que.add(node.right);
                if (node.left != null) que.add(node.left);
                size--;
            }
            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            result.add(sum / list.size());
        }
        return result;
    }
}