package priv.algorithm.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description: 222.完全二叉树节点数
 * @date: 2022/4/21 22:11
 */
public class LeetCode222 {

    public int countNodes(TreeNode root) {
        if (null == root) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            count++;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return count;
    }
}
