package priv.algorithm.leetcode.tree;

import java.util.*;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 12:42
 */
public class LeetCode107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<List<Integer>> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> inner = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                inner.add(node.val);
                if(null != node.left) queue.offer(node.left);
                if(null != node.right) queue.offer(node.right);
            }

            result.add(inner);
        }
        Collections.reverse(result);

        return result;
    }
}
