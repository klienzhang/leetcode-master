package priv.algorithm.leetcode.str;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/18 19:41
 */
public class KMP {

    public int kmp(String s, String t) {
        int m = s.length(), n = t.length();
        int[] next = new int[n];
        getNext(t, next);
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (j == -1 || s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else j = next[j];
        }
        if (j >= n) return i - n;
        else return -1;
    }

    public void getNext(String t, int[] next) {
        int j = 0, k = -1, n = t.length();
        next[0] = -1;
        while (j < n - 1) {
            if (k == -1 || t.charAt(j) == t.charAt(k)) {
                j++;
                k++;
                next[j] = k;
            }
            else k = next[k];
        }
    }

    @Test
    public void testCase() {
        String t = "ababa";
        int[] next = new int[t.length()];

        getNext(t,next);
        System.out.println(next);

        System.out.println(kmp("hello", "ll"));
    }
}
