package com.dsa.saurabh.level04.BinaryTree.Till20;

public class BinaryTree_MirrorTree {

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

    private TreeNode mirrorTree(TreeNode node) {
        if (node == null) return node;

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirrorTree(node.left);
        mirrorTree(node.right);

        return node;

    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree_MirrorTree binaryTree_mirrorTree = new BinaryTree_MirrorTree();
        binaryTree_mirrorTree.root = new TreeNode(10);
        binaryTree_mirrorTree.root.left = new TreeNode(20);
        binaryTree_mirrorTree.root.right = new TreeNode(30);
        binaryTree_mirrorTree.inorder(binaryTree_mirrorTree.root);
        TreeNode treeNode = binaryTree_mirrorTree.mirrorTree(binaryTree_mirrorTree.root);
        System.out.println();
        binaryTree_mirrorTree.inorder(treeNode);
    }
}
