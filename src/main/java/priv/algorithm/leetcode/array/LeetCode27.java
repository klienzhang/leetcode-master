package priv.algorithm.leetcode.array;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 21:54
 */
public class LeetCode27 {

    public int removeElement(int[] nums, int val) {
        int l = 0, r = 0, count = 0;
        while (l < nums.length) {
            if (nums[l] != val) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                count++;
                r++;
            }
            l++;
        }

        return l;
    }
}
