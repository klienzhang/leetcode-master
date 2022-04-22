package priv.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 14:19
 */
public class LeetCode429 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> inner = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                inner.add(node.val);

                List<Node> l = node.children;
                if (l != null) {
                    for (Node n : l) {
                        queue.offer(n);
                    }
                }
            }
            result.add(inner);
        }

        return result;
    }
}
