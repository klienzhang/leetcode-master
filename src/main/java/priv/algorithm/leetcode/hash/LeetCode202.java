package priv.algorithm.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: klien.zq
 * @description: 202. 快乐数
 * @date: 2022/4/18 12:23
 */
public class LeetCode202 {

    /**
     * 每次生成的数字放进set，如果循环中发现结果已经在set里说明这个数字会无限循环，返回false
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        Set<Integer> refer = new HashSet<>();
        while (n != 1 && !refer.contains(n)) {
            refer.add(n);

            int temp = 0;
            while (n > 0) {
                temp += (n % 10)*(n % 10);
                n = n / 10;
            }
            n = temp;
        }

        return n == 1;
    }

}
