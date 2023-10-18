package com.henu.yaheng.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {
    private List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return list;
    }

    public void traversal(TreeNode node){
        if (node == null) return;
        //左右中
        traversal(node.left);
        traversal(node.right);
        list.add(node.val);
    }
}
