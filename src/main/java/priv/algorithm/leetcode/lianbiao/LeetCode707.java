package priv.algorithm.leetcode.lianbiao;

import org.testng.annotations.Test;

/**
 * @author: klien.zq
 * @description:
 * @date: 2022/4/21 16:43
 */
public class LeetCode707 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val=val;
        }
    }

    private int size = 0;
    private ListNode listNode = new ListNode(Integer.MIN_VALUE);

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;

        ListNode temp = listNode;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = temp.next;
        temp.next = newNode;

        size++;

    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return;

        ListNode temp = listNode;
        ListNode pre = null;
        for (int i = 0; i <= index; i++) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
        size--;
    }

    public int get(int index) {
        if (index >= size) return -1;

        ListNode temp = listNode;
        for (int i = 0; i <= index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    @Test
    public void testCase() {
        LeetCode707 ob = new LeetCode707();
        ob.addAtHead(4);
        System.out.println(ob.get(1));
        ob.addAtHead(1);
        ob.addAtHead(5);
        ob.deleteAtIndex(3);
        ob.addAtHead(7);
        System.out.println(ob.get(3));
        System.out.println(ob.get(3));
        System.out.println(ob.get(3));
        ob.addAtHead(1);
        ob.deleteAtIndex(4);
    }
}
