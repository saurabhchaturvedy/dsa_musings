package com.dsa.saurabh.level01.Tree_CS;

public class Binary_AncestorOfANode {

    private TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean printAncestors(TreeNode node, int value) {
        if (node == null) return false;

        if (node.data == value) {
            return true;
        }

        if (printAncestors(node.left, value) || printAncestors(node.right, value)) {
            System.out.println(node.data);
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Binary_AncestorOfANode binary_ancestorOfANode = new Binary_AncestorOfANode();
        binary_ancestorOfANode.root = new TreeNode(2);
        binary_ancestorOfANode.root.left = new TreeNode(7);
        binary_ancestorOfANode.root.left.right = new TreeNode(6);
        binary_ancestorOfANode.root.left.right.left = new TreeNode(5);
        binary_ancestorOfANode.root.left.right.right = new TreeNode(11);
        binary_ancestorOfANode.root.left.left = new TreeNode(10);

        binary_ancestorOfANode.root.right = new TreeNode(9);
        binary_ancestorOfANode.root.right.right = new TreeNode(3);

        binary_ancestorOfANode.printAncestors(binary_ancestorOfANode.root, 11);
    }
}
