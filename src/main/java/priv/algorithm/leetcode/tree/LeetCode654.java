package priv.algorithm.leetcode.tree;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/22 15:15
 */
public class LeetCode654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (null == nums || nums.length < 1) return null;

        //找出最大值
        int loc = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                loc = i;
            }
        }

        TreeNode mid = new TreeNode(nums[loc]);
        int[] leftNums = new int[loc];
        int[] rightNums = new int[nums.length - loc - 1];
        for (int i = 0; i < loc; i++) {
            leftNums[i] = nums[i];
        }
        for (int i = 0; i < rightNums.length; i++) {
            rightNums[i] = nums[loc + i + 1];
        }
        TreeNode left = constructMaximumBinaryTree(leftNums);
        TreeNode right = constructMaximumBinaryTree(rightNums);
        mid.left = left;
        mid.right = right;

        return mid;
    }

    @Test
    public void testCase() {
        System.out.println(constructMaximumBinaryTree(new int[]{3,2,1,6,0,5}));
    }

}
