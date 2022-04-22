package priv.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/22 15:37
 */
public class LeetCode257 {
    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        combine(root, new LinkedList<>());
        return result;
    }

    public void combine(TreeNode root, LinkedList<Integer> sb){
        sb.add(root.val);
        if (root.left == null && root.right == null) {
            System.out.println(sb.size());
            String str = "";
            for (int i = 0; i < sb.size() - 1; i++) {
                str = str + sb.get(i) + "->";
            }
            str += sb.get(sb.size() - 1);
            result.add(str);
            return;
        }

        if (root.left != null) {
            combine(root.left, sb);
            sb.removeLast();
        }
        if (root.right != null) {
            combine(root.right, sb);
            sb.removeLast();
        }
    }
}
