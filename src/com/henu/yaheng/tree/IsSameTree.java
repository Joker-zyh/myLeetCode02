package com.henu.yaheng.tree;

import java.util.Deque;
import java.util.LinkedList;

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //迭代法，使用队列，成对的存取
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(p);
        deque.offerLast(q);

        while (!deque.isEmpty()){
            TreeNode leftNode = deque.pollFirst();
            TreeNode rightNode = deque.pollFirst();

            if (leftNode == null && rightNode == null) {
                continue;
            }

            if (leftNode == null || rightNode == null || leftNode.val != rightNode.val){
                return false;
            }
            deque.offerLast(leftNode.left);
            deque.offerLast(rightNode.left);

            deque.offerLast(leftNode.right);
            deque.offerLast(rightNode.right);

        }
        return true;
    }
}
