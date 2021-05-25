package com.tree;

import java.util.ArrayList;
import java.util.List;
//二叉树的中序遍历 ：递归。
public class inOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        inOrder(root,res);
        return res;
    }
    public void inOrder(TreeNode root,List<Integer> res)
    {
        if(root==null)
            return;
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
    }
}
