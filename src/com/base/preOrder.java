package com.base;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class preOrder {
    public static void main(String[] args) {

    }
//    public List<Integer> preOrder(Node root)
//    {//前序遍历递归实现
//        //List<Integer>()
////        return Node;
//    }
    public int[] levelOrede(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>() {{
            add(root);
        }};//初始化队列并将根节点add进去
        ArrayList<Integer> ans = new ArrayList<>();//初始化一个AL ans
        while (!queue.isEmpty()) {  //循环条件为队列不为空
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            res[i] = ans.get(i);
        return res;
    }
}
