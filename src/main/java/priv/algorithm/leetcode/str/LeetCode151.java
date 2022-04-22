package priv.algorithm.leetcode.str;

import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/18 20:44
 */
public class LeetCode151 {

    public String reverseWords(String s) {
        Deque<String> stack = new ArrayDeque<>();
        StringBuffer sb = new StringBuffer();

        int left = 0, right = s.length() - 1;
        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }
        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }
        while (left <= right) {
            if (s.charAt(left) == ' ' && sb.length() != 0 ) {
                stack.offerFirst(sb.toString());
                sb.setLength(0);
            } else if (s.charAt(left) != ' ') {
                sb.append(s.charAt(left));
            }
            left++;
        }
        stack.offerFirst(sb.toString());

        return String.join(" ", stack);
    }

    @Test
    public void testCase() {
        System.out.println(reverseWords("  hello world  "));
    }

}
