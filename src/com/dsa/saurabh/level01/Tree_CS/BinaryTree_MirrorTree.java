package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_MirrorTree {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private TreeNode convertToMirrorTree(TreeNode node) {
        if (node == null) {
            return null;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        convertToMirrorTree(node.left);
        convertToMirrorTree(node.right);

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
        binaryTree_mirrorTree.root = new BinaryTree_MirrorTree.TreeNode(1);
        binaryTree_mirrorTree.root.left = new BinaryTree_MirrorTree.TreeNode(2);
        binaryTree_mirrorTree.root.left.right = new BinaryTree_MirrorTree.TreeNode(3);
        binaryTree_mirrorTree.root.left.right.right = new BinaryTree_MirrorTree.TreeNode(4);
        binaryTree_mirrorTree.root.left.right.left = new BinaryTree_MirrorTree.TreeNode(5);
        binaryTree_mirrorTree.root.left.left = new BinaryTree_MirrorTree.TreeNode(6);
        binaryTree_mirrorTree.root.right = new BinaryTree_MirrorTree.TreeNode(7);
        binaryTree_mirrorTree.root.right.right = new BinaryTree_MirrorTree.TreeNode(8);
        binaryTree_mirrorTree.root.right.right.left = new BinaryTree_MirrorTree.TreeNode(9);
        binaryTree_mirrorTree.inorder(binaryTree_mirrorTree.root);
        binaryTree_mirrorTree.convertToMirrorTree(binaryTree_mirrorTree.root);
        System.out.println();
        binaryTree_mirrorTree.inorder(binaryTree_mirrorTree.root);
    }
}
