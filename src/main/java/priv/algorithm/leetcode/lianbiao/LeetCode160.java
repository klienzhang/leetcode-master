package priv.algorithm.leetcode.lianbiao;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: klien.zq
 * @description: 02.07. 链表相交
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 * @date: 2022/4/21 14:30
 */
public class LeetCode160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> refer = new HashSet<>();

        while (headA != null) {
            refer.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (refer.contains(headB)) return headB;
            headB = headB.next;
        }

        return null;
    }

    /**
     * 双指针法
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}
