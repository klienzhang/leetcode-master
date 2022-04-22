package priv.algorithm.leetcode.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 19:59
 */
public class LeetCode78 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList();

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length < 1) return new ArrayList<>();
        combine(nums, 0);
        return result;
    }

    public void combine(int[] nums, int startIndex) {
        result.add(new ArrayList<>(temp));
        if (temp.size() >= nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            temp.add(nums[i]);
            combine(nums, i + 1);
            temp.removeLast();
        }
    }
}
