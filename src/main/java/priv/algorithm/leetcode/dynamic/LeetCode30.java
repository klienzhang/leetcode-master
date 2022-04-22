package priv.algorithm.leetcode.dynamic;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/17 15:56
 */
public class LeetCode30 {

    /**
     * 第一反应应该是使用斐波那契数列。至于为什么是斐波那契数列，比如现在走4层，那对于走到第4层，可以从2层走2步或者3层走1步，所以f(4) = f(3) + f(2)。以此类推
     * 但是leetcode上这么run肯定超时
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1 || n == 2) return n;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * 走动态规划
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        if (n == 1 || n == 2) return n;

        //第一位是走到第几层，第二位表示走1格还是走2格
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }

    @Test
    public void testCase() {
        System.out.println(climbStairs(10));
        System.out.println(climbStairs2(10));
    }
}
