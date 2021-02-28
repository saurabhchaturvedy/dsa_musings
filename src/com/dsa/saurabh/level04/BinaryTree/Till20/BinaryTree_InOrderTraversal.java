package com.dsa.saurabh.level04.BinaryTree.Till20;

import java.util.Stack;

public class BinaryTree_InOrderTraversal {

    TreeNode root;
    int maxLevel = 0;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        Stack<TreeNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                TreeNode tmp = temp.right;

                while (tmp != null) {
                    stack.push(tmp);
                    tmp = tmp.left;
                }
            }

        }
    }

    public static void main(String[] args) {
        BinaryTree_InOrderTraversal binaryTree_inOrderTraversal = new BinaryTree_InOrderTraversal();
        binaryTree_inOrderTraversal.root = new TreeNode(10);
        binaryTree_inOrderTraversal.root.left = new TreeNode(20);
        binaryTree_inOrderTraversal.root.right = new TreeNode(30);

        binaryTree_inOrderTraversal.inorder(binaryTree_inOrderTraversal.root);
    }
}
