package com.LinkedList;
//思路：pre指针 cur指针
public class reverseList {
        public ListNode reverseList(ListNode head) {
            ListNode cur=head;
            ListNode pre=null;
            while(cur!=null)
            {
                ListNode temp=cur.next;//暂存后继结点
                cur.next=pre;     //改变指向
                pre=cur;            //暂存当前结点
                cur=temp;               //访问下一结点
            }
            return pre;
        }
    }

