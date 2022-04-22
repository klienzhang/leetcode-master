package priv.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: klien.zq
 * @description: 144. 前序排序
 * @date: 2022/4/19 10:51
 */
public class LeetCode144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode treeNode, List<Integer> result) {
        if (treeNode == null) return;

        result.add(treeNode.val);
        inorder(treeNode.left, result);
        inorder(treeNode.right, result);
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (null == temp) continue;

            result.add(temp.val);
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }

        return result;
    }
}
