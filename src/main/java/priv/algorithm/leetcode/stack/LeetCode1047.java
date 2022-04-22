package priv.algorithm.leetcode.stack;

import org.testng.annotations.Test;

import java.util.Stack;

/**
 * @author: klien.zq
 * @description: 1047. 删除字符串中的所有相邻重复项
 * @date: 2022/4/16 15:21
 */
public class LeetCode1047 {

    public String removeDuplicates(String s) {
        if (null == s || s.length() <= 1) return s;

        Stack<Character> stack = new Stack<>();

        for (char t : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == t) {
                stack.pop();
            } else {
                stack.push(t);
            }
        }

        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }

    @Test
    public void testCase() {
        System.out.println(removeDuplicates("abbaca"));
    }
}
