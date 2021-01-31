package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_DLL {

    TreeNode root;
    TreeNode linkedListHead = null;
    TreeNode previous = null;

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

    private TreeNode convertBinaryTree2DLL(TreeNode node) {

        if (node == null) return null;


        convertBinaryTree2DLL(node.left);
        if (previous == null) {
            linkedListHead = node;
            previous = node;
        } else {
            node.left = previous;
            previous.right = node;
            previous = node;
        }

        convertBinaryTree2DLL(node.right);
        return linkedListHead;
    }

    private void displayDLL(TreeNode node) {
        if (node == null) return;
        TreeNode temp = node;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.right;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        BinaryTree_DLL binaryTree_dll = new BinaryTree_DLL();
        binaryTree_dll.root = new TreeNode(12);
        binaryTree_dll.root.left = new TreeNode(7);
        binaryTree_dll.root.right = new TreeNode(24);
        binaryTree_dll.root.left.left = new TreeNode(2);
        binaryTree_dll.root.left.right = new TreeNode(8);

        TreeNode treeNode = binaryTree_dll.convertBinaryTree2DLL(binaryTree_dll.root);
        binaryTree_dll.displayDLL(treeNode);

    }
}
