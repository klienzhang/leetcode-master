package priv.algorithm.leetcode.huisu;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/21 19:02
 */
public class LeetCode131 {

    private Deque<String> result = new LinkedList<>();
    private Deque<String> temp = new LinkedList<>();

    public Deque<String> partition(String s) {
        if (s.length() < 1) return result;
        combine(s, 0);
        return result;
    }

    public void combine(String s, int start) {
        if (start >= s.length()) return;

        for (int i = start; i < s.length(); i++) {
            temp.add(s.substring(start, i + 1));
            result.add(s.substring(start, i + 1));
            combine(s, i + 1);
            temp.removeLast();
        }
    }

    @Test
    public void testCase() {
        partition("abcd");
        System.out.println(result);
    }

    public boolean isHuiWen(String str) {
        if (str.length() == 1) return true;

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
