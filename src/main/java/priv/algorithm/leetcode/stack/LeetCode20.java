package priv.algorithm.leetcode.stack;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: klien.zq
 * @description: 20. 有效的括号
 * @date: 2022/4/16 15:12
 */
public class LeetCode20 {

    public boolean isValid(String s) {
        Map<Character, Character> refer = new HashMap() {{
            put('}', '{');
            put(')', '(');
            put(']', '[');
        }};
        if (null == s || s.length() < 1) return true;

        Stack<Character> stack = new Stack<>();

        for (char t : s.toCharArray()) {
            if (t == '{' || t == '[' || t == '(') {
                stack.push(t);
            } else {
                if (stack.isEmpty()) return false;
                if (refer.get(t) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    @Test
    public void testCase() {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
    }
}
