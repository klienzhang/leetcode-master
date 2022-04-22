package priv.algorithm.leetcode.tanxin;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: klien.zq
 * @description: 860. 柠檬水找零
 * @date: 2022/4/17 20:30
 */
public class LeetCode860 {

    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> refer = new HashMap<>();

        for (int money : bills) {
            //如果是5块钱就直接收入
            if (money == 5) {
                refer.put(5, refer.getOrDefault(5, 0) + 1);
            } else if (money == 10){
                if (refer.getOrDefault(5, 0) == 0) return false;
                refer.put(5, refer.get(5) - 1);
                refer.put(10, refer.getOrDefault(10, 0) + 1);
            } else {
                int refund = 15;
                if (refer.getOrDefault(10, 0) > 0) {
                    refer.put(10, refer.get(10) - 1);
                    refund = 5;
                }
                if (refer.getOrDefault(5, 0) >= refund / 5) {
                    refer.put(5, refer.get(5) - refund / 5);
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    public void testCase() {
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));
    }
}
