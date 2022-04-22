package priv.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: klien.zq
 * @description: 94. 二叉树中序排序
 * @date: 2022/4/19 10:42
 */
public class LeetCode94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode treeNode, List<Integer> result) {
        if (treeNode == null) return;

        inorder(treeNode.left, result);
        result.add(treeNode.val);
        inorder(treeNode.right, result);
    }
}
