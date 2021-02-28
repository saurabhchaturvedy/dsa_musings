package com.dsa.saurabh.level04.BinaryTree.Till20;

import java.util.Stack;

public class BinaryTree_PreOrderTraversal {

    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private void preorder(TreeNode node) {
        if (node == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree_PreOrderTraversal binaryTree_preOrderTraversal = new BinaryTree_PreOrderTraversal();
        binaryTree_preOrderTraversal.root = new TreeNode(10);
        binaryTree_preOrderTraversal.root.left = new TreeNode(20);
        binaryTree_preOrderTraversal.root.right = new TreeNode(30);
        binaryTree_preOrderTraversal.preorder(binaryTree_preOrderTraversal.root);
    }
}
