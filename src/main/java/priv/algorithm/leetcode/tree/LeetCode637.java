package priv.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 13:02
 */
public class LeetCode637 {

    public List<Double> averageOfLevels(TreeNode root) {
        if (null == root) return new ArrayList<>();

        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Double sum = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (null != node.left) queue.offer(node.left);
                if (null != node.right) queue.offer(node.right);
            }
            result.add(Double.valueOf(sum/size));
        }

        return result;
    }
}
