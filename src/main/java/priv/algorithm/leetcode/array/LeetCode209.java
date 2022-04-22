package priv.algorithm.leetcode.array;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 20:59
 */
public class LeetCode209 {
    LinkedList<Integer> temp = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();

    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0;

        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum >= target) {
                min = Math.min(min, r - l + 1);
                sum -= nums[l];
                l++;
            }
            r++;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    /**
     * 如果不连续可以用回溯法
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen2(int target, int[] nums) {
        if (nums.length < 1) return 0;
        combine(nums, target, 0, 0);

        if (result.size() == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (List<Integer> list : result) {
            min = Math.min(min, list.size());
        }
        return min;
    }

    public void combine(int[] nums, int target, int startIndex, int sum) {
        if (sum >= target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            sum += nums[i];
            temp.add(nums[i]);
            combine(nums, target, i + 1, sum);
            temp.removeLast();
            sum -= nums[i];
        }
    }

    @Test
    public void testCase() {
        System.out.println(minSubArrayLen2(213, new int[]{12,28,83,4,25,26,25,2,25,25,25,12}));
    }
}
