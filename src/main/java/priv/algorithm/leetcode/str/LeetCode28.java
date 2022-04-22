package priv.algorithm.leetcode.str;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description: 28. 实现 strStr()
 * @date: 2022/4/18 19:52
 */
public class LeetCode28 {

    public int strStr(String haystack, String needle) {
        int h = 0, n = 0;
        int[] next = getNext(needle);

        while (h < haystack.length() && n < needle.length()) {
            if (n == -1 || haystack.charAt(h) == needle.charAt(n)) {
                h++; n++;
            } else {
                n = next[n];
            }
        }

        return n >= needle.length() ? h - needle.length() : -1;
    }


    public int[] getNext(String subStr) {
        int k = -1;
        int[] next = new int[subStr.length()];
        next[0] = -1;

        for (int j = 0; j < subStr.length(); j++) {
            if (k == -1 || subStr.charAt(j) == subStr.charAt(k)) {
                k++;
                j++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    @Test
    public void testCase() {
        System.out.println(strStr("hello" , "ll"));
    }
}
