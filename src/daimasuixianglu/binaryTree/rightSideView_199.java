package daimasuixianglu.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = que.size();
            while(size>0){
                TreeNode node = que.remove();
                if(size == 1){
                    list.add(node.val);
                }
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                size--;
            }
            result.add(list.get(list.size()-1));
        }
        return result;
    }
}
