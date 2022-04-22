package priv.algorithm.leetcode.tanxin;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author: klien.zq
 * @description: 455. 分发饼干
 * @date: 2022/4/16 18:33
 */
public class LeetCode455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int len = s.length - 1;
        for (int i = g.length - 1; i >=0; i--) {
            if (len>=0 && g[i] <= s[len]) {
                //满足了
                count++;
                len--;
            }
        }

        return count;
    }

    @Test
    public void testCase() {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
    }
}
