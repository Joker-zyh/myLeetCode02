package com.henu.yaheng.tree.level_order;

import com.henu.yaheng.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //创建结果集
        List<List<Integer>> ans = new ArrayList<>();
        //判空
        if (root == null) return ans;

        //创建队列
        Deque<TreeNode> deque = new LinkedList<>();
        //将根节点插入队列
        deque.offerLast(root);
        while (!deque.isEmpty()){
            //确定每层的节点数
            int size = deque.size();
            //创建每层节点值集合
            List<Integer> list = new ArrayList<>();
            //只处理该层节点
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                list.add(node.val);
                if (node.left != null) deque.offerLast(node.left);
                if (node.right != null) deque.offerLast(node.right);
            }
            ans.add(list);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = ans.size() -1;i >=0 ; i--){
            result.add(ans.get(i));
        }
        return result;
    }
}
