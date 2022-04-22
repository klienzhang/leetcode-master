package priv.algorithm.leetcode.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 16:30
 */
public class LeetCode216 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        combine(k, n, 0, 1);
        return result;
    }

    public void combine(int k, int n, int sum, int startIndex) {
        if (temp.size() == k) {
            if (sum == n) {
                result.add(new ArrayList<>(temp));
            }
        }

        for (int i = startIndex; i <= 9; i++) {
            temp.add(i);
            sum += i;
            combine(k, n, sum, i+1);
            sum -= i;
            temp.removeLast();
        }
    }
}
