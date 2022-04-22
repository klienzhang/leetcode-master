package priv.algorithm.leetcode.huisu;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 15:57
 */
public class LeetCode77 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracing(n, k, 0);
        return result;
    }

    public void backtracing(int n, int k, int startIndex) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = startIndex; i < n - (k - temp.size()) + 1; i++) {
            temp.add(i);
            backtracing(n, k, i + 1);
            temp.removeLast();
        }
    }

    @Test
    public void testCase() {
        System.out.println(combine(5, 2));
    }
}
