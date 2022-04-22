package priv.algorithm.leetcode.array;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/18 23:29
 */
public class LeetCode179 {

    public String largestNumber(int[] nums) {
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++) {
            int a = Integer.valueOf(String.valueOf(nums[i]) + String.valueOf(temp));
            int b = Integer.valueOf(String.valueOf(temp) + String.valueOf(nums[i]));
            temp = a > b ? a : b;
        }
        return String.valueOf(temp);
    }
}
