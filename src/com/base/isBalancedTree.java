package com.base;

public class isBalancedTree {
    private  boolean isBalance(TreeNode root)
    {
        if(root==null)
            return true;
        if(Math.abs(depth(root.right)-depth(root.left))<2&&isBalance(root.left)&&
                isBalance(root.right))
            return true;
       else{
           return false;
        }
    }
    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
    

}
