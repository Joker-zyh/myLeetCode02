package com.henu.yaheng.tree.level_order;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


public class NChildrenTreeNode {
    public List<List<Integer>> levelOrder(Node root) {
        //创建结果集，判空
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        //创建队列，根节点入队
        Deque<Node> deque = new LinkedList<>();
        deque.offerLast(root);
        //循环遍历每层
        while (!deque.isEmpty()){
            //每层节点个数,单层结果集
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            //处理每层节点
            for (int i = 0; i < size; i++) {
                Node node = deque.pollFirst();
                list.add(node.val);
                //子节点入队
                for (Node child : node.children) {
                    if (child != null){
                        deque.offerLast(node);
                    }
                }

            }
            ans.add(list);
        }
        return ans;

    }
}
