package com.henu.yaheng.tree.level_order;

import com.henu.yaheng.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        //创建结果集
        List<Integer> ans = new ArrayList<>();
        //判空
        if (root == null) return ans;
        //创建队列，将根节点加入队列
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);

        while (!deque.isEmpty()){
            //该层节点个数
            int size = deque.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                if (node.left != null)deque.offerLast(node.left);
                if (node.right != null)deque.offerLast(node.right);
                if (i == size -1){
                    ans.add(node.val);
                }
            }
        }
        return ans;
    }
}
