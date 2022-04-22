package priv.algorithm.leetcode.jianzhi;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/18 21:30
 */
public class JZ48 {

    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;
        int currentLen = 0;
        Set<Character> refer = new HashSet<>();
        int left = 0;
        while (left < s.length()) {
            if (!refer.contains(s.charAt(left))) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
                refer.add(s.charAt(left));
                left++;
            } else {
                currentLen = 0;
                refer.clear();
            }
        }
        return maxLen;
    }
}
