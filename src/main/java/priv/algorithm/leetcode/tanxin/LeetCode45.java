package priv.algorithm.leetcode.tanxin;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/17 19:28
 */
public class LeetCode45 {

    public int jump(int[] nums) {
        int count = 0;
        int nextLocation = 0;
        int rightMost = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            rightMost = Math.max(rightMost, i + nums[i]);
            if (i == nextLocation){
                nextLocation = rightMost;
                count++;
            }
        }
        return count;
    }

    @Test
    public void testCase() {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
}
