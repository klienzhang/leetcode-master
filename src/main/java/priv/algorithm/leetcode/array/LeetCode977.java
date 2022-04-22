package priv.algorithm.leetcode.array;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 20:41
 */
public class LeetCode977 {

    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            int a = nums[left] * nums[left];
            int b = nums[right] * nums[right];

            result[index--] = Math.max(a, b);
            if (a > b) left++; else right--;
        }

        return result;
    }
}
