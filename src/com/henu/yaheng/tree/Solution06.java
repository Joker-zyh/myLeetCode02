package com.henu.yaheng.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution06 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return false;
        }
        return compare(root.left,root.right);
    }

    private boolean compare(TreeNode left,TreeNode right){
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left == null && right == null) return true;
        if (left.val != right.val) return false;
        boolean outside = compare(left.left, right.right);
        boolean inside = compare(left.right, right.left);
        return outside && inside;
    }


    /*public boolean isSymmetric(TreeNode root) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        getValue1(list1,root);
        getValue2(list2,root);

        if (list1.size() != list2.size()){
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }

    private void getValue1(List<Integer> list1,TreeNode root){
        //中左右
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node == null) {
                list1.add(101);
            }else {
                list1.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
    }
    private void getValue2(List<Integer> list2,TreeNode root){
        //中右左
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node == null) {
                list2.add(101);
            }else {
                list2.add(node.val);
                stack.push(node.left);
                stack.push(node.right);
            }
        }
    }*/
}
