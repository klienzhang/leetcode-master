package priv.algorithm.leetcode.dynamic;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/17 16:13
 */
public class LeetCode746 {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = dp[1] = 0;

        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }

        return dp[cost.length];
    }

    @Test
    public void testCase() {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }
}
