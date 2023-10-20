package com.henu.yaheng.tree.level_order;

import com.henu.yaheng.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        //创建结果集，判空
        List<Double> ans = new ArrayList<>();
        if (root == null) return ans;
        //创建队列，根节点入队
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);
        //循环，逐层遍历
        while (!deque.isEmpty()){
            int size = deque.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                sum += node.val;
                if (node.left != null) deque.offerLast(node.left);
                if (node.right != null) deque.offerLast(node.right);
            }
            ans.add(sum/size);
        }
        return ans;
    }
}
