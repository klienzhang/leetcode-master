package priv.algorithm.leetcode.tree;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/22 11:48
 */
public class LeetCode513 {

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode tempLeft = null;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (0 == i) tempLeft = temp;
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
            }
        }

        return tempLeft.val;
    }

    @Test
    public void testCase() {
        TreeNode t7 = new TreeNode(7);
        TreeNode t6 = new TreeNode(6);
        TreeNode t5 = new TreeNode(5, t7,null);
        TreeNode t3 = new TreeNode(3, t5,t6);

        TreeNode t4 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2, t4, null);

        TreeNode t1 = new TreeNode(1, t2, t3);

        System.out.println(findBottomLeftValue(t1));
    }
}
