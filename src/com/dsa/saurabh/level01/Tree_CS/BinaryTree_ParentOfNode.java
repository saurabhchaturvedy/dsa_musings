package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_ParentOfNode {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private TreeNode getParent(TreeNode node, int value) {
        if (node == null || node.data == value) return node;

        if ((node.left != null && node.left.data == value) || (node.right != null && node.right.data == value)) {
            return node;
        }

        TreeNode parent = getParent(node.left, value);

        if (parent != null) return parent;

        parent = getParent(node.right, value);

        return parent;
    }


    public static void main(String[] args) {
        BinaryTree_ParentOfNode binary_ancestorOfANode = new BinaryTree_ParentOfNode();
        binary_ancestorOfANode.root = new BinaryTree_ParentOfNode.TreeNode(2);
        binary_ancestorOfANode.root.left = new BinaryTree_ParentOfNode.TreeNode(7);
        binary_ancestorOfANode.root.left.right = new BinaryTree_ParentOfNode.TreeNode(6);
        binary_ancestorOfANode.root.left.right.left = new BinaryTree_ParentOfNode.TreeNode(5);
        binary_ancestorOfANode.root.left.right.right = new BinaryTree_ParentOfNode.TreeNode(11);
        binary_ancestorOfANode.root.left.left = new BinaryTree_ParentOfNode.TreeNode(10);

        binary_ancestorOfANode.root.right = new BinaryTree_ParentOfNode.TreeNode(9);
        binary_ancestorOfANode.root.right.right = new BinaryTree_ParentOfNode.TreeNode(3);

        TreeNode parent = binary_ancestorOfANode.getParent(binary_ancestorOfANode.root, 11);
        if (parent != null) {
            System.out.println("parent is : " + parent.data);
        } else {
            System.out.println("parent not found ");
        }
    }
}
