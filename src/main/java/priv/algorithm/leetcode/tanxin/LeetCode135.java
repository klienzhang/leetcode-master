package priv.algorithm.leetcode.tanxin;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/17 21:36
 */
public class LeetCode135 {
    public int candy(int[] ratings) {

        int count = ratings.length;

        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i] > ratings[i + 1]) {
                count++;
            }
        }

        return count;
    }
}
