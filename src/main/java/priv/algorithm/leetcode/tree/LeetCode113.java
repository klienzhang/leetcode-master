package priv.algorithm.leetcode.tree;

import java.util.*;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/22 14:47
 */
public class LeetCode113 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return new ArrayList<>();

        combine(root, targetSum, new LinkedList<>());

        return result;
    }

    public void combine(TreeNode root, int targetSum, LinkedList<Integer> tempResult) {
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                tempResult.add(root.val);
                result.add(new ArrayList<>(tempResult));
                tempResult.removeLast();
                return;
            }
        }

        if (root.left != null) {
            tempResult.add(root.val);
            combine(root.left, targetSum - root.val, tempResult);
            tempResult.removeLast();
        }

        if (root.right != null) {
            tempResult.add(root.val);
            combine(root.right, targetSum - root.val, tempResult);
            tempResult.removeLast();
        }
    }
}
