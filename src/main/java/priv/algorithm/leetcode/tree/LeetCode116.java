package priv.algorithm.leetcode.tree;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 13:56
 */
public class LeetCode116 {

    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        Node pre = null;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (pre != null) {
                    pre.next = node;
                }
                if (null != node.left) queue.offer(node.left);
                if (null != node.right) queue.offer(node.right);
                pre = node;
            }
            pre = null;
        }

        return root;
    }

}
