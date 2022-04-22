package priv.algorithm.leetcode.tanxin;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/16 20:05
 */
public class LeetCode53 {
    /**
     * 走贪心算法
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    /**
     * 走动态规划
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];

        for (int i=1; i< nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
}
