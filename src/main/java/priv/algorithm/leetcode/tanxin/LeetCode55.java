package priv.algorithm.leetcode.tanxin;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description: 55. 跳跃游戏
 * @date: 2022/4/17 19:11
 */
public class LeetCode55 {

    public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;

        int nextReachableLocation = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i > nextReachableLocation) return false;
            nextReachableLocation = Math.max(nextReachableLocation, i + nums[i]);
            if (nextReachableLocation >= nums.length - 1) return true;
        }

        return false;
    }

    @Test
    public void testCase() {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
}
