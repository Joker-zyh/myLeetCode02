package com.henu.yaheng.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traversal(root);
        return list;

    }

    public void traversal(TreeNode node){
        if (node == null) return;
        //中左右
        list.add(node.val);
        traversal(node.left);
        traversal(node.right);
    }
}
