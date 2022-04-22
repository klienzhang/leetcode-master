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
public class LeetCode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> refer = new HashMap<>();
        for (int x = 0; x < nums1.length; x++) {
            refer.put(nums1[x], x);
        }

        int[] array = new int[nums1.length];
        Arrays.fill(array, -1);

        for (int i = 0; i < nums2.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]) {
                int temp = stack.pop();
                if (refer.containsKey(nums2[temp])) {
                    int loc = refer.get(nums2[temp]);
                    array[loc] = nums2[i];
                }
            }
            stack.push(i);
        }

        return array;
    }

    @Test
    public void testCase() {
        System.out.println(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
    }
}
