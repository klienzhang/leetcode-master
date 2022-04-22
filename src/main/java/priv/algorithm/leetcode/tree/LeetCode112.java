package priv.algorithm.leetcode.tree;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/22 14:38
 */
public class LeetCode112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
