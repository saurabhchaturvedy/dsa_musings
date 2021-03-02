package com.dsa.saurabh.level04.BinaryTree.Till30;

public class BinaryTree_PrintBoundaryNodes {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void printBoundaryNodes(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");

        printLeftBoundaryNodes(node.left);

        printLeafNodes(node.left);
        printLeafNodes(node.right);

        printRightBoundaryNodes(node.right);
    }

    private void printLeafNodes(TreeNode node) {
        if (node == null) {
            return;
        }

        printLeafNodes(node.left);

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        printLeafNodes(node.right);
    }

    private void printLeftBoundaryNodes(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            System.out.print(node.data + " ");
            printLeftBoundaryNodes(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            printLeftBoundaryNodes(node.right);
        }
    }

    private void printRightBoundaryNodes(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.right != null) {
            printRightBoundaryNodes(node.right);
            System.out.print(node.data + " ");
        } else if (node.left != null) {
            printRightBoundaryNodes(node.left);
            System.out.print(node.data + " ");
        }
    }


    public static void main(String[] args) {
        BinaryTree_PrintBoundaryNodes binaryTree_printBoundaryNodes = new BinaryTree_PrintBoundaryNodes();
        binaryTree_printBoundaryNodes.root = new TreeNode(2);
        binaryTree_printBoundaryNodes.root.left = new TreeNode(7);
        binaryTree_printBoundaryNodes.root.right = new TreeNode(15);
        binaryTree_printBoundaryNodes.root.right.right = new TreeNode(20);
        binaryTree_printBoundaryNodes.root.right.right.right = new TreeNode(25);
        binaryTree_printBoundaryNodes.root.left.right = new TreeNode(8);
        binaryTree_printBoundaryNodes.root.left.right.left = new TreeNode(5);
        binaryTree_printBoundaryNodes.root.left.right.right = new TreeNode(10);
        binaryTree_printBoundaryNodes.root.left.left = new TreeNode(3);

        binaryTree_printBoundaryNodes.printBoundaryNodes(binaryTree_printBoundaryNodes.root);
    }


}
