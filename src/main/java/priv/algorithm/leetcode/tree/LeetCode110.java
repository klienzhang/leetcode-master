package priv.algorithm.leetcode.tree;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/22 11:25
 */
public class LeetCode110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(height(root.left) - height(root.right)) <= 1;
    }

    /**
     * 计算树的深度
     * @param treeNode
     * @return
     */
    public int height(TreeNode treeNode) {
        if (null == treeNode) return 0;

        return Math.max(height(treeNode.left), height(treeNode.right)) + 1;
    }
}
