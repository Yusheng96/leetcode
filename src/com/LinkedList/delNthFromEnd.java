package com.LinkedList;
//删除链表的倒数第K个结点
public class delNthFromEnd {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode dummy=new ListNode(0);
        dummy.next=head;   //leetcode 写法 只需一句ListNode dummy=new ListNode(0,head);
        ListNode former = head;
        ListNode latter = dummy;
        for(int i = 0; i < n; i++)
            former = former.next;
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        latter.next=latter.next.next;
        ListNode res=dummy.next;
        return res;
    }
}
