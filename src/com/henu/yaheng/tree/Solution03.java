package com.henu.yaheng.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traversal(root);
        return list;
    }

    public void traversal(TreeNode node){
        if (node == null) return;
        //左中右
        traversal(node.left);
        list.add(node.val);
        traversal(node.right);
    }
}
