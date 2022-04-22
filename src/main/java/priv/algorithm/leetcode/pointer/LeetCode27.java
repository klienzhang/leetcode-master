package priv.algorithm.leetcode.pointer;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 01:39
 */
public class LeetCode27 {

    public int removeElement(int[] nums, int val) {

        int arrow = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[arrow];
                nums[arrow] = nums[i];
                nums[i] = temp;
                arrow++;
                count++;
            }
        }

        return count;
    }
}
