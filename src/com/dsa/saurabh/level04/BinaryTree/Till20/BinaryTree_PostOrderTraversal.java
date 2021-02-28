package com.dsa.saurabh.level04.BinaryTree.Till20;

import java.util.Stack;

public class BinaryTree_PostOrderTraversal {

    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void postorder(TreeNode node) {
        if (node == null) return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(node);

        while (!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();

            if (temp.left != null) {
                stack1.push(temp.left);
            }

            if (temp.right != null) {
                stack1.push(temp.right);
            }

            stack2.push(temp);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree_PostOrderTraversal binaryTree_postOrderTraversal = new BinaryTree_PostOrderTraversal();
        binaryTree_postOrderTraversal.root = new TreeNode(10);
        binaryTree_postOrderTraversal.root.left = new TreeNode(20);
        binaryTree_postOrderTraversal.root.right = new TreeNode(30);
        binaryTree_postOrderTraversal.postorder(binaryTree_postOrderTraversal.root);
    }
}
