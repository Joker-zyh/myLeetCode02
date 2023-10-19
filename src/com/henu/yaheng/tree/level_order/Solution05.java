package com.henu.yaheng.tree.level_order;

import com.henu.yaheng.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution05 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();

        if (root == null) return ans;

        deque.offerLast(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                list.add(node.val);
                if (node.left != null)deque.offerLast(node.left);
                if (node.right != null)deque.offerLast(node.right);
            }
            ans.add(list);
        }
        return ans;
    }
}
