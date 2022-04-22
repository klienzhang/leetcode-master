package priv.algorithm.leetcode.chart;

import org.testng.annotations.Test;

import java.util.Stack;

/**
 * @author: klien.zq
 * @description: 739. 每日温度
 * @date: 2022/4/20 17:12
 */
public class LeetCode739 {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        stack.push(0);
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int loc = stack.pop();
                result[loc] = i - loc;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int loc = stack.pop();
            result[loc] = 0;
        }

        return result;
    }

    @Test
    public void testCase() {
        System.out.println(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    }
}
