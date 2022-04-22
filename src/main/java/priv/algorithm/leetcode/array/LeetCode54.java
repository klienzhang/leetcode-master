package priv.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: klien.zq
 * @description: 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * @date: 2022/4/20 13:35
 */
public class LeetCode54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {
            for (int x = left; x <= right; x++) {
                result.add(matrix[top][x]);
            }
            for (int x = top + 1; x <= bottom; x++) {
                result.add(matrix[x][right]);
            }
            if (left < right && top < bottom) {
                for (int x = right - 1; x > left; x--) {
                    result.add(matrix[bottom][x]);
                }
                for (int x = bottom; x > top; x--) {
                    result.add(matrix[x][left]);
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }

        return result;
    }
}
