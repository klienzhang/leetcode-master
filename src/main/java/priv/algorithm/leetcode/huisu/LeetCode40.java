package priv.algorithm.leetcode.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 19:25
 */
public class LeetCode40 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> buffer = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length < 1) return new ArrayList<>();
        Arrays.sort(candidates);
        combine(candidates, target, 0, 0);
        return result;
    }

    public void combine(int[] candidates, int target, int sum, int startIndex) {
        if (target < sum) {
            return;
        }
        if (target == sum) {
            result.add(new ArrayList<>(buffer));
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (i > startIndex && candidates[i] == candidates[i - 1]) continue;
            buffer.add(candidates[i]);
            sum += candidates[i];
            combine(candidates, target, sum, i + 1);
            buffer.removeLast();
            sum -= candidates[i];
        }
    }
}
