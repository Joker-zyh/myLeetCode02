package com.henu.yaheng.tree;

import java.util.Deque;
import java.util.LinkedList;

public class Solution05 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);

        while (!deque.isEmpty()){
            int size = deque.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                //反转左右子节点
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;

                if (node.left != null) deque.offerLast(node.left);
                if (node.right != null) deque.offerLast(node.right);
            }
        }
        return root;
    }
}
