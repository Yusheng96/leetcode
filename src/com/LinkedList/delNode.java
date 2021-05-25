package com.LinkedList;

public class delNode {
    public ListNode deleteNode(ListNode head, int val) {

        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val)
            cur = cur.next;

        if (cur.next != null)
            cur.next = cur.next.next;
        return head;

    }
}

