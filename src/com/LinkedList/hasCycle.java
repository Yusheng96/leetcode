package com.LinkedList;
import java.util.*;
//判断链表是否有环
public class hasCycle {
    public  boolean hasCycle(ListNode head){
        Set<ListNode> set=new HashSet<ListNode>();
        while(head!=null){
            if(!set.add(head)){
                return true;
            }
            set.add(head);
            head=head.next;

        }
        return  false;
    }
}
