package priv.algorithm.leetcode.dynamic;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description: 509. 斐波那契数
 * @date: 2022/4/17 15:37
 */
public class LeetCode509 {

    /**
     * 使用递归实现
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return fib(n -1) + fib(n - 2);
    }

    /**
     * 使用动规实现
     * @param n
     * @return
     */
    public int fib2(int n) {
        if (n == 0 || n == 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i -2];
        }

        return dp[n];
    }

    @Test
    public void testCase() {
        System.out.println(fib(10));
        System.out.println(fib2(10));
    }
}
