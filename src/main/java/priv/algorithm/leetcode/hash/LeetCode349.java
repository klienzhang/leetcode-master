package priv.algorithm.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: klien.zq
 * @description: 349. 两个数组的交集
 * @date: 2022/4/18 12:11
 */
public class LeetCode349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> refer = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int n : nums1) {
            refer.add(n);
        }

        for (int n : nums2) {
            if (refer.contains(n)) {
                result.add(n);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
