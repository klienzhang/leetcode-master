package priv.algorithm.leetcode.tree;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 10:43
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
