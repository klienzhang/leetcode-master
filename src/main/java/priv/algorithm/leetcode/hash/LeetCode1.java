package priv.algorithm.leetcode.hash;

import java.util.HashMap;

/**
 * @author: klien.zq
 * @description: 1. 两数之和
 * @date: 2022/4/18 13:04
 */
public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> refer = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int yu = target - nums[i];
            if (refer.containsKey(yu)) return new int[]{i, refer.get(yu)};
            refer.put(nums[i], i);
        }
        return new int[]{};
    }
}
