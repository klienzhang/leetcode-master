package priv.algorithm.leetcode.lianbiao;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/21 14:47
 */
public class LeetCode142 {

    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        Set<ListNode> refer = new HashSet<>();

        while (temp != null) {
            if (refer.contains(temp)) return temp;
            refer.add(temp);
            temp = temp.next;
        }

        return null;
    }

    /**
     * 双指针追及问题
     * @param head
     * @return
     */
    public ListNode detectCycle2(ListNode head) {
        if(head == null) return null;
        ListNode af = head;
        ListNode bs = head;

        while (true) {
            if (af.next == null || af.next.next == null) return null;
            af = af.next.next;
            bs = bs.next;
            if (af == bs) break;
        }

        af = head;
        while (af != bs) {
            af = af.next;
            bs = bs.next;
            if (af == bs) break;
        }
        return af;
    }
}
