package priv.algorithm.leetcode.str;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description: 459. 重复的子字符串
 * @date: 2022/4/18 16:45
 */
public class LeetCode459 {

    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {
                boolean flag = true;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) return true;
            }
        }

        return false;
    }

    @Test
    public void testCase() {
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
