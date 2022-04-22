package priv.algorithm.leetcode.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/22 12:11
 */
public class LeetCode404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;
        Set<TreeNode> refer = new HashSet<>();

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (refer.contains(temp)) {
                if (temp.left != null || temp.right != null) {
                    sum -= temp.val;
                }
            }
            if (temp.left != null) {
                sum += temp.left.val;
                refer.add(temp.left);
                queue.offer(temp.left);
            }
            if (temp.right != null) queue.offer(temp.right);
        }

        return sum;
    }
}
