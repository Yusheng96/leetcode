package com.LinkedList;
import java.util.*;
//判断是否为回文链表
public class isHuiwen {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode cur = head;
            List<Integer> list = new ArrayList<Integer>();
            while (cur!= null) {//遍历链表时，只要当前结点指针不为空
                list.add(cur.val);
                cur = cur.next;//
            }
            for (int i = 0; i < list.size(); i++) {
                if (!(list.get(i).equals(list.get(list.size() - i - 1)))) {
                    return false;
                }
            }
            return true;
        }

    }
}
