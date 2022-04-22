package priv.algorithm.leetcode.tanxin;

import org.testng.annotations.Test;

import javax.swing.plaf.IconUIResource;

/**
 * @author: klien.zq
 * @description: 134. 加油站
 * @date: 2022/4/17 21:04
 */
public class LeetCode134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        boolean run = true;

        for (int i = 0; i < gas.length; i++) {
            start = i;
            int current = start;
            int tank = 0;
            run = true;
            while (run) {
                if (tank + gas[current] - cost[current] < 0) {
                    run = false;
                } else {
                    tank += gas[current] - cost[current];
                    current++;
                    if (current == gas.length) current = 0;
                    if (current == start) return start;
                }
            }
        }

        return -1;
    }

    /**
     * 官方解
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n) {
            int sumOfGas = 0, sumOfCost = 0;
            int cnt = 0;
            while (cnt < n) {
                int j = (i + cnt) % n;
                sumOfGas += gas[j];
                sumOfCost += cost[j];
                if (sumOfCost > sumOfGas) {
                    break;
                }
                cnt++;
            }
            if (cnt == n) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }

    @Test
    public void testCase() {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
    }
}
