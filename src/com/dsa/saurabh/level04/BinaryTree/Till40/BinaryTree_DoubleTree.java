package com.dsa.saurabh.level04.BinaryTree.Till40;

public class BinaryTree_DoubleTree {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void add(TreeNode parent, TreeNode child, String childType) {
        if (childType.equals("l")) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }

    private void doubleTree(TreeNode node) {
        if (node == null) return;

        doubleTree(node.left);
        doubleTree(node.right);

        TreeNode newNode = new TreeNode(node.data);
        newNode.left = node.left;
        node.left = newNode;
    }

    private void display(TreeNode node) {
        if (node == null) return;
        display(node.left);
        System.out.print(node.data + " ");
        display(node.right);
    }


    public static void main(String[] args) {
        BinaryTree_DoubleTree binaryTree_doubleTree = new BinaryTree_DoubleTree();
        binaryTree_doubleTree.root = new TreeNode(2);

        TreeNode first = new TreeNode(5);
        TreeNode second = new TreeNode(8);

        binaryTree_doubleTree.add(binaryTree_doubleTree.root, first, "l");
        binaryTree_doubleTree.add(binaryTree_doubleTree.root, second, "r");

        binaryTree_doubleTree.display(binaryTree_doubleTree.root);

        System.out.println();

        binaryTree_doubleTree.doubleTree(binaryTree_doubleTree.root);

        binaryTree_doubleTree.display(binaryTree_doubleTree.root);
    }
}
