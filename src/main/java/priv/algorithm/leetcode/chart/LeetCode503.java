package priv.algorithm.leetcode.chart;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/20 18:44
 */
public class LeetCode503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[nums.length];
        Arrays.fill(array, -1);
        for (int i = 0; i < nums.length * 2; i++) {
            if (stack.isEmpty()) {
                stack.push(i % nums.length);
                continue;
            }

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % nums.length]) {
                int temp = stack.pop();
                array[temp] = nums[i % nums.length];
            }
            stack.push(i % nums.length);
        }

        return array;
    }

    @Test
    public void testCase() {
        System.out.println(nextGreaterElements(new int[]{4,1,2}));
    }
}
