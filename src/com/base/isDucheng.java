package com.base;

public class isDucheng {
    public boolean  isSymmetric(TreeNode root){
        return root==null?true:reCur(root.right,root.left);
    }

    public boolean reCur(TreeNode L,TreeNode R)
    {
        if(L==null&&R==null)
        return true;
        if(L==null||R==null||L.val!= R.val)
            return false;

        return reCur(L.left, R.right)&&reCur(L.right,R.left);

    }
}
