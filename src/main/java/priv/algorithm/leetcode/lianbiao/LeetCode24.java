package priv.algorithm.leetcode.lianbiao;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/21 11:47
 */
public class LeetCode24 {

    /**
     * 链表有指针操作，比较绕
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {

        ListNode result = new ListNode(-1);
        result.next = head;

        ListNode temp = result;
        ListNode cur = head;
        ListNode pre = null;

        while (cur != null) {
            if (pre == null) {
                pre = cur;
                cur = cur.next;
            } else {
                ListNode next = cur.next;
                temp.next = cur;
                cur.next = pre;
                pre.next = next;

                temp = pre;
                pre = null;
                cur = next;
            }
        }
        return result.next;
    }

    @Test
    public void testCase() {

    }
}
