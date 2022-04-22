package priv.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/18 13:10
 */
public class LeetCode383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> refer = new HashMap<>();

        for (char m : magazine.toCharArray()) {
            refer.put(m, refer.getOrDefault(m, 0) + 1);
        }
        for (char r : ransomNote.toCharArray()) {
            if (refer.getOrDefault(r, 0) < 1) return false;
            refer.put(r, refer.getOrDefault(r, 0) - 1);
        }
        return true;
    }
}
