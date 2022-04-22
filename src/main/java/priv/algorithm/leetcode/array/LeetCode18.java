package priv.algorithm.leetcode.array;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/21 18:18
 */
public class LeetCode18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);

            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < nums.length - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                    int left = j + 1, right = nums.length - 1;
                    while (left < right) {
                        if (nums[i] + nums[left] + nums[right] + nums[j] == target) {
                            result.add(Arrays.asList(nums[i], nums[left], nums[right], nums[j]));
                            while(left < right && nums[left] == nums[left + 1])left++;
                            while(left < right && nums[right] == nums[right - 1])right--;
                            left++;
                            right--;
                        } else if (nums[i] + nums[left] + nums[right] + nums[j] > target) {
                            right--;
                        } else {
                            left++;
                        }
                    }
                }
            }

            return result;
    }

    @Test
    public void testCase() {
        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
}