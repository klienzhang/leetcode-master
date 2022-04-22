package priv.algorithm.leetcode.stack;

import org.testng.annotations.Test;

import java.util.Stack;

/**
 * @author: klien.zq
 * @description: 逆波兰表达式求值
 * @date: 2022/4/16 15:31
 */
public class LeetCode150 {

    public int evalRPN(String[] tokens) {
        if (null == tokens || tokens.length < 1) return 0;

        Stack<Integer> numStack = new Stack<>();

        for (String t : tokens) {
            if (isDigit(t)) {
                numStack.push(Integer.parseInt(t));
            } else if (t.equals("+")) {
                int a = numStack.pop();
                int b = numStack.pop();
                numStack.push(b + a);
            } else if (t.equals("-")) {
                int a = numStack.pop();
                int b = numStack.pop();
                numStack.push(b - a);
            } else if (t.equals("*")) {
                int a = numStack.pop();
                int b = numStack.pop();
                numStack.push(b * a);
            } else if (t.equals("/")) {
                int a = numStack.pop();
                int b = numStack.pop();
                numStack.push(b / a);
            }
        }
        return numStack.pop();
    }

    public boolean isDigit(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }

    @Test
    public void testCase() {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
    }
}
