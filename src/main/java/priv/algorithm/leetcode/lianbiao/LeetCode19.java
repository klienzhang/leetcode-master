package priv.algorithm.leetcode.lianbiao;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/21 13:37
 */
public class LeetCode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode temp = result;

        for (int i = 0; i < n; i++) {
            //长度不够n，直接返回head
            if (null == temp) {
                return head;
            }
            temp = temp.next;
        }

        ListNode temp2 = result;
        ListNode pre = null;
        while (temp != null) {
            pre = temp2;
            temp = temp.next;
            temp2 = temp2.next;
        }

        pre.next = temp2.next;
        return result.next;
    }
}
