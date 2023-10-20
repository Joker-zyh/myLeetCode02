package com.henu.yaheng.tree.level_order;

import com.henu.yaheng.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LargestValues {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);

        while (!deque.isEmpty()){
            int size = deque.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                max = Math.max(max,node.val);
                if (node.left != null) deque.offerLast(node.left);
                if (node.right != null) deque.offerLast(node.right);
            }
            ans.add(max);
        }
        return ans;
    }
}
