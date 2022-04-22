package priv.algorithm.leetcode.str;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author: klien.zq
 * @description: 344. 反转字符串
 * @date: 2022/4/18 15:21
 */
public class LeetCode344 {

    public void reverseString(char[] s) {

        int l = 0, r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    @Test
    public void testCase() {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
}
