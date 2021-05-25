package com.LinkedList;
// 删除排序链表中的重复元素
public class DelDup {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
       if(head==null)
           return null;
       while (fast!=null)//一开始错写成fast.next!=null
       {
           if(fast.val!=slow.val)
           {
               slow.next=fast;//相当于num[slow]=num[fast]
               slow=slow.next;
           }
           fast=fast.next;
       }
       slow.next=null;
       return head;
    }
}
