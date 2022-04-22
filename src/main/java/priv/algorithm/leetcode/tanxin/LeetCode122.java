package priv.algorithm.leetcode.tanxin;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/16 20:55
 */
public class LeetCode122 {

    /**
     * 标准动规实现
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; ++i) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            System.out.println(prices[i] + "#" + dp[i][0] + "#" + dp[i][1]);
        }
        return dp[n - 1][0];
    }

    /**
     * 贪心算法
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]){
                max += prices[i] - prices[i-1];
            }
        }
        return max;
    }

    @Test
    public void testCase() {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
