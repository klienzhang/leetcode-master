package priv.algorithm.leetcode.array;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 22:07
 */
public class LeetCode283 {

    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;

        while (r < nums.length) {
            if (nums[r] != 0) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
            r++;
        }
    }
}
