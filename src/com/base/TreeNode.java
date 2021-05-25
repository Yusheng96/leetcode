package com.base;

import java.util.ArrayList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length;
//        if(prices[0]==0){
//            return 0;
//        }

        for(int i=0;i<n;i++)
        {
            int min=prices[0];
            if(prices[i]<min)
            {
                profit=prices[i]-min;
            }

        }
        return profit;
    }
    class Solution {
        ArrayList<Integer> temp=new ArrayList<Integer>();
        public int[] reversePrint(ListNode head)
        {
            recur(head);
            int[] res=new int[temp.size()];
            for(int i=0;i<res.length;i++)
            {
                res[i]=temp.get(i);
            }
            return res;
        }
        void recur(ListNode head)
        {
            if(head==null)
                return;
            recur(head.next);
            temp.add(head.val);
        }
    }
}