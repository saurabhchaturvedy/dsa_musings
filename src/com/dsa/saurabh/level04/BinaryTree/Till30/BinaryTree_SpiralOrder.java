package com.dsa.saurabh.level04.BinaryTree.Till30;

import java.util.Stack;

public class BinaryTree_SpiralOrder {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private void spiralOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();

        leftStack.push(node);

        while (!leftStack.isEmpty() || !rightStack.isEmpty()) {

            while (!leftStack.isEmpty()) {
                TreeNode temp = leftStack.pop();
                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    rightStack.push(temp.left);
                }

                if (temp.right != null) {
                    rightStack.push(temp.right);
                }
            }
            System.out.println();
            while (!rightStack.isEmpty()) {
                TreeNode temp = rightStack.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null) {
                    leftStack.push(temp.right);
                }

                if (temp.left != null) {
                    leftStack.push(temp.left);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        BinaryTree_SpiralOrder binaryTree_spiralOrder = new BinaryTree_SpiralOrder();
        binaryTree_spiralOrder.root = new TreeNode(2);
        binaryTree_spiralOrder.root.left = new TreeNode(7);
        binaryTree_spiralOrder.root.right = new TreeNode(5);
        binaryTree_spiralOrder.root.right.right = new TreeNode(9);
        binaryTree_spiralOrder.root.left.right = new TreeNode(6);
        binaryTree_spiralOrder.root.left.right.left = new TreeNode(5);
        binaryTree_spiralOrder.root.left.right.right = new TreeNode(11);
        binaryTree_spiralOrder.root.left.right.left.left = new TreeNode(10);

        binaryTree_spiralOrder.spiralOrder(binaryTree_spiralOrder.root);
    }
}
