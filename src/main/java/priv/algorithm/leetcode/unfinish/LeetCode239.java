package priv.algorithm.leetcode.unfinish;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/16 16:05
 */
public class LeetCode239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - 2];

        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int s : nums) {
            int index = 0;
            if (count < k) {
                queue.add(s);
                count++;
            } else {
                //比较
                result[index++] = getMax(queue);
                queue.poll();
                queue.add(s);
            }
        }

        return result;
    }

    public int getMax(Queue<Integer> queue){
        int result = queue.poll();

        Queue<Integer> queue1 = queue;


        while (!queue1.isEmpty()) {
            int temp = queue1.poll();
            if (result < temp) {
                result = temp;
            }
        }

        return result;
    }

    @Test
    public void testCase() {
        int[] result = maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        for (int i : result) {
            System.out.println(i + "#");
        }
    }
}
