package com.henu.yaheng.tree;

import java.util.Deque;
import java.util.LinkedList;

public class IsSubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null){
            return true;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);

        while (!deque.isEmpty()){
            int size = deque.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                //比较
                if (compare(node,subRoot)) {
                    return true;
                }
                if (node.left != null)deque.offerLast(node.left);
                if (node.right != null) deque.offerLast(node.right);
            }
        }
        return false;
    }

    private boolean compare(TreeNode node,TreeNode sub){
        if (node == null && sub != null) return false;
        if (node != null && sub == null) return false;
        if (node == null && sub == null) return true;
        if (node.val != sub.val) return false;

        boolean left = compare(node.left, sub.left);
        boolean right = compare(node.right, sub.right);
        return left && right;
    }

    private boolean isSame(TreeNode node,TreeNode sub){
        //使用队列，成对的存取
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(node);
        deque.offerLast(sub);

        while (!deque.isEmpty()){
            if (node == null && sub == null){
                continue;
            }
            if (node == null || sub == null || node.val != sub.val){
                return false;
            }

            deque.offerLast(node.left);
            deque.offerLast(sub.left);

            deque.offerLast(node.right);
            deque.offerLast(sub.right);

        }
        return true;
    }
}
