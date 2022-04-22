package priv.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 10:52
 */
public class LeetCode145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode treeNode, List<Integer> result) {
        if (treeNode == null) return;
        inorder(treeNode.left, result);
        inorder(treeNode.right, result);
        result.add(treeNode.val);
    }

}
