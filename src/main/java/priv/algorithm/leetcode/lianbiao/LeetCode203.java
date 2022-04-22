package priv.algorithm.leetcode.lianbiao;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/20 20:55
 */
public class LeetCode203 {

    public ListNode removeElements(ListNode head, int val) {
        // 跳过头部命中val的节点
        while (head != null) {
            if (head.val == val) {
                head = head.next;
            } else {
                break;
            }
        }

        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
}
