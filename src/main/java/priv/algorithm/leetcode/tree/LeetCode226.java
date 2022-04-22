package priv.algorithm.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author: klien.zq
 * @description: 226. 翻转二叉树
 * @date: 2022/4/19 14:40
 */
public class LeetCode226 {

    /**
     * 递归做法
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode left= invertTree(root.left);
        TreeNode right= invertTree(root.right);
        root.left = right;
        root.right = left;

        return root;
    }

    /**
     * 广度做法
     * @param root
     * @return
     */
    public TreeNode invertTree2(TreeNode root) {
        if (null == root) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i =0; i<size; i++) {
                TreeNode node = queue.poll();
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                if (null != node.left) queue.offer(node.left);
                if (null != node.right) queue.offer(node.right);
            }
        }

        return root;
    }

    /**
     * 深度优先
     * @param root
     * @return
     */
    public TreeNode invertTree3(TreeNode root) {
        if (null == root) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = stack.pop();
                TreeNode n = temp.left;
                temp.left = temp.right;
                temp.right = n;

                if (null != temp.right) stack.push(temp.right);
                if (null != temp.left) stack.push(temp.left);
            }
        }

        return root;
    }
}
