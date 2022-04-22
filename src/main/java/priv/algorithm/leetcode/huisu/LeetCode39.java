package priv.algorithm.leetcode.huisu;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 18:15
 */
public class LeetCode39 {


    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracing(candidates, target, 0, 0);
        return result;
    }


    public void backtracing(int[] candidates, int target, int sum, int startIndex) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            temp.add(candidates[i]);
            sum += candidates[i];
            backtracing(candidates, target, sum, i);
            sum -= candidates[i];
            temp.removeLast();
        }
    }

    @Test
    public void testCase() {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }
}
