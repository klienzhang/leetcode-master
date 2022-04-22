package priv.algorithm.leetcode.str;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/18 15:41
 */
public class LeetCode541 {

    public String reverseStr(String s, int k) {

        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i += 2 * k) {
            int l = i, r = Math.min(s.length() - 1, i + k - 1);
            while (l < r) {
                char temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
        }
        return new String(array);
    }
}
