package com.LinkedList;
//删除排序链表中出现重复的结点
public class delDup2 {
        public ListNode deleteDuplicates (ListNode head){
            ListNode dummy = new ListNode();
            ListNode tail = dummy;

            while (head != null) {
                //head 已经没有下一个节点，head 可以被插入
                //head有一下个节点，但是值与 head 不相同，head 可以被插入
                if (head.next == null || head.val != head.next.val) {
                    tail.next = head;
                    tail = head;
                }
                while (head.next != null && head.val == head.next.val)
                    head = head.next;
                head = head.next;
            }
            tail.next = null;
            return dummy.next;
        }


    }


