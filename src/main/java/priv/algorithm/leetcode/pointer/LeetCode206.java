package priv.algorithm.leetcode.pointer;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/19 02:04
 */
public class LeetCode206 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;

        while (cur != null) {
            ListNode listNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = listNode;
        }
        return pre;
    }
}
