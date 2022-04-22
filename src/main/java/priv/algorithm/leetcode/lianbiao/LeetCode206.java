package priv.algorithm.leetcode.lianbiao;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/21 11:34
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;
    }
}
