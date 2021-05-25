package com.tree;
//层序遍历
import  java.util.*;
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}
public class levelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();//新建二维数组
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();//新建队列存放结点
        queue.offer(root);//将树根结点add到队列
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();	//	新建数组记录结点的层级
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {//遍历队列中的结点
                TreeNode node = queue.poll(); //接受队头出队的元素
                level.add(node.val);   //将结点值add进level数组
                if (node.left != null) {//  将左右结点add进队
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(level);
        }

        return res;
    }
}
