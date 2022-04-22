package priv.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 12:21
 */
public class LeetCode102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> tempQueue = new LinkedList<>();
        queue.offer(root);

        List<List<Integer>> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            List<Integer> inner = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                inner.add(node.val);
                tempQueue.offer(node);
            }
            while (!tempQueue.isEmpty()) {
                TreeNode node = tempQueue.poll();
                if(null != node.left) queue.offer(node.left);
                if(null != node.right) queue.offer(node.right);
            }
            result.add(inner);
        }
        return result;
    }
}
