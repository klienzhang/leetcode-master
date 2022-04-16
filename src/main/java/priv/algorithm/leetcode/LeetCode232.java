package priv.algorithm.leetcode;

import org.testng.annotations.Test;

import java.text.MessageFormat;
import java.util.Stack;

/**
 * @author: klien.zq
 * @title: 232. 用栈实现队列
 * @description: https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * @date: 2022/4/16 13:30
 */
public class LeetCode232 {

    private Stack<Integer> temp = new Stack<>();
    private Stack<Integer> finalStack = new Stack<>();

    private String TEMPLATE = "[{0}]的结束为[{1}]";

    public void push(int x) {
        while (!finalStack.isEmpty()) {
            temp.push(finalStack.pop());
        }
        temp.push(x);
        while (!temp.isEmpty()) {
            finalStack.push(temp.pop());
        }
    }

    public int pop() {
        if (finalStack.isEmpty()) return Integer.MIN_VALUE;
        return finalStack.pop();
    }

    public int peek() {
        if (finalStack.isEmpty()) return Integer.MIN_VALUE;
        return finalStack.peek();
    }

    public boolean empty() {
        return finalStack.isEmpty();
    }

    @Test
    public void testCase() {
        LeetCode232 ob = new LeetCode232();
        ob.push(1);
        ob.push(2);
        System.out.println(MessageFormat.format(TEMPLATE, "peek", ob.peek()));
        System.out.println(MessageFormat.format(TEMPLATE, "isEmpty", ob.empty()));
        System.out.println(MessageFormat.format(TEMPLATE, "pop", ob.pop()));
        System.out.println(MessageFormat.format(TEMPLATE, "pop", ob.pop()));
        System.out.println(MessageFormat.format(TEMPLATE, "isEmpty", ob.empty()));
        System.out.println(MessageFormat.format(TEMPLATE, "pop", ob.pop()));
    }
}
