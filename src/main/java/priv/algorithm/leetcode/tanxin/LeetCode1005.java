package priv.algorithm.leetcode.tanxin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: klien.zq
 * @description: 1005. K 次取反后最大化的数组和
 * @date: 2022/4/17 20:20
 */
public class LeetCode1005 {

    public int largestSumAfterKNegations(int[] nums, int k) {

        Set<Integer> refer = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (k <= 0) return Arrays.stream(nums).sum();
            refer.add(nums[i]);
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        if (k <= 0) return Arrays.stream(nums).sum();
        if (k % 2 == 1) {
            if (!refer.contains(0)) {
                Arrays.sort(nums);
                nums[0] = -nums[0];
            }
        }

        return Arrays.stream(nums).sum();
    }
}
