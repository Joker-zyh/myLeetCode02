package com.henu.yaheng.tree;

public class TreeTest {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(10,new TreeNode(5),new TreeNode(15));

        TreeNode node1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(10,node1,null);
        node1.right = new TreeNode(15);

        IsSameTree sameTree = new IsSameTree();
        sameTree.isSameTree(root1,root2);


    }
}
