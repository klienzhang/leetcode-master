package priv.algorithm.leetcode.stack;

import org.testng.annotations.Test;

import java.util.*;

/**
 * @author: klien.zq
 * @description: 347. 前 K 个高频元素
 * @date: 2022/4/16 17:03
 */
public class LeetCode347 {

    public int[] topKFrequent(int[] nums, int k) {
        //统计出所有数字的出现次数
        Map<Integer, Integer> refer = new HashMap<>();
        for (int n : nums) {
            refer.put(n, refer.getOrDefault(n, 0) + 1);
        }

        //感觉出现次数对数字进行排序
        //queue需要进行升序，也就是说k之外的第一个比对元素和queue里第一位peek出来的min进行比较
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return refer.get(o1) - refer.get(o2);
            }
        });

        for (Map.Entry<Integer, Integer> m : refer.entrySet()) {
            if (queue.size() < k) {
                queue.add(m.getKey());
            } else {
                if (refer.get(queue.peek()) < m.getValue()) {
                    queue.remove();
                    queue.add(m.getKey());
                }
            }
        }

        int[] result = new int[k];
        int index = 0;
        while (!queue.isEmpty()) result[index++] = queue.poll();

        return result;
    }

    @Test
    public void testCase() {
        int[] result = topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
