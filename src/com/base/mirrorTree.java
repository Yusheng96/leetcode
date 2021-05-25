package com.base;

public class mirrorTree {
    public TreeNode mirrorTree(TreeNode root) {

        if(root==null)
            return null;

        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
