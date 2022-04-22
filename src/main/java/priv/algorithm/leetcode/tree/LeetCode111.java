package priv.algorithm.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description: 111. 二叉树的最小深度
 * @date: 2022/4/19 13:22
 */
public class LeetCode111 {

    /**
     * 其实就是广度遍历的时候，寻找第一个没有左右子树的节点，返回当前节点的深度
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int dp = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.right == null && node.left == null) {
                    return dp + 1;
                }
                if (null != node.left) queue.offer(node.left);
                if (null != node.right) queue.offer(node.right);
            }
            dp++;
        }

        return dp;
    }
}
