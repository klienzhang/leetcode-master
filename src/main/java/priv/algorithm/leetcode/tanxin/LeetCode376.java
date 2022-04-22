package priv.algorithm.leetcode.tanxin;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/16 18:59
 */
public class LeetCode376 {

    /**
     * 走贪心算法
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int pre = nums[1] - nums[0];
        int current = 0;
        int time = pre == 0 ? 1 : 2;
        for (int i = 2; i < nums.length; i++) {
            current = nums[i] - nums[i - 1];
            if ((pre <= 0 && current > 0) || (pre >= 0 && current < 0)) {
                time++;
                pre = current;
            }
        }
        return time;
    }

    /**
     * 走动态规划
     */
    public int wiggleMaxLength2(int[] nums) {
        if (nums.length <= 1) return nums.length;

        //第二位表示波峰波谷
        int[][] dp = new int[nums.length][2];
        dp[0][1] = dp[0][0] = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                //上升
                dp[i][0] = Math.max(dp[i-1][1] + 1, dp[i-1][0]);
                dp[i][1] = dp[i - 1][1];
            } else if (nums[i] < nums[i - 1]){
                //向下
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = Math.max(dp[i-1][0] + 1, dp[i-1][1]);
            } else {
                //平行
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][1];
            }
        }

        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }
}
