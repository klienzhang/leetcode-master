package priv.algorithm.leetcode.array;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/20 11:38
 */
public class LeetCode59 {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        for (int lun = 0; lun < n; lun++) {
            //顶排
            for (int y = lun; y < n - lun; y++) {
                result[lun][y] = num++;
            }
            //右边
            for (int x = lun + 1; x < n - lun; x++) {
                result[x][n - lun - 1] = num++;
            }
            //下边
            for (int y = n - 1 - lun - 1; y >= lun; y--) {
                result[n - 1 - lun][y] = num++;
            }
            //左边
            for (int x = n - 1 - lun - 1; x > lun; x--) {
                result[x][lun] = num++;
            }
        }
        return result;
    }

    @Test
    public void testCase() {
        System.out.println(generateMatrix(3));
    }
}
