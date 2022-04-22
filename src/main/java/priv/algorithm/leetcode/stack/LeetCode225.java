package priv.algorithm.leetcode.stack;

import org.testng.annotations.Test;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: klien.zq
 * @description: 225. 用队列实现栈
 * @date: 2022/4/16 14:42
 */
public class LeetCode225 {

    private Queue<Integer> temp = new LinkedList();
    private Queue<Integer> finalQueue = new LinkedList();

    private String TEMPLATE = "[{0}]的结束为[{1}]";

    public void push(int x) {
        temp.add(x);
        while (!finalQueue.isEmpty()) {
            temp.add(finalQueue.poll());
        }
        while (!temp.isEmpty()) {
            finalQueue.add(temp.poll());
        }
    }

    public int pop() {
        if (finalQueue.isEmpty()) return Integer.MIN_VALUE;
        return finalQueue.poll();
    }

    public int top() {
        if (finalQueue.isEmpty()) return Integer.MIN_VALUE;
        return finalQueue.peek();
    }

    public boolean empty() {
        return finalQueue.isEmpty();
    }

    @Test
    public void testCase() {
        LeetCode225 ob = new LeetCode225();
        ob.push(1);
        ob.push(2);
        System.out.println(MessageFormat.format(TEMPLATE, "top", ob.top()));
        System.out.println(MessageFormat.format(TEMPLATE, "isEmpty", ob.empty()));
        System.out.println(MessageFormat.format(TEMPLATE, "pop", ob.pop()));
        System.out.println(MessageFormat.format(TEMPLATE, "pop", ob.pop()));
        System.out.println(MessageFormat.format(TEMPLATE, "isEmpty", ob.empty()));
        System.out.println(MessageFormat.format(TEMPLATE, "pop", ob.pop()));
    }
}
