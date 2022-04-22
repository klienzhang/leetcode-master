package priv.algorithm.leetcode.tree;

/**
 * @author: klien.zq
 * @description: 101.判断是否对称二叉树
 * @date: 2022/4/21 22:02
 */
public class LeetCode101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;

        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (null == left || null == right) return false;
        if (left.val != right.val) return false;
        return dfs(left.right, right.left) && dfs(left.left, right.right);
    }
}
