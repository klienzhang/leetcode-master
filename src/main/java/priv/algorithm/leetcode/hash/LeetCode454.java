package priv.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: klien.zq
 * @description: 454. 四数相加 II
 * @date: 2022/4/18 13:46
 */
public class LeetCode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> refer  = new HashMap<>();

        int count = 0;
        for (int n1 : nums1) {
            for (int n2 : nums2){
                refer.put(n1 + n2, refer.getOrDefault(n1 + n2, 0) + 1);
            }
        }

        for (int n3: nums3) {
            for (int n4 : nums4) {
                if (refer.getOrDefault(-n3-n4, 0).compareTo(0) > 0) {
                    count += refer.get(-n3-n4);
                }
            }
        }
        return count;
    }
}
