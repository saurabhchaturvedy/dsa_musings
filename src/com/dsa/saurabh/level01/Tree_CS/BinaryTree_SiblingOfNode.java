package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_SiblingOfNode {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private TreeNode getSibling(TreeNode node, int value) {
        if (node == null || node.data == value) return node;

        if ((node.left != null && node.left.data == value)) {
            return node.right;
        }


        if ((node.right != null && node.right.data == value)) {
            return node.left;
        }

        TreeNode parent = getSibling(node.left, value);

        if (parent != null) return parent;

        parent = getSibling(node.right, value);

        return parent;
    }


    public static void main(String[] args) {
        BinaryTree_SiblingOfNode binary_ancestorOfANode = new BinaryTree_SiblingOfNode();
        binary_ancestorOfANode.root = new TreeNode(2);
        binary_ancestorOfANode.root.left = new TreeNode(7);
        binary_ancestorOfANode.root.left.right = new TreeNode(6);
        binary_ancestorOfANode.root.left.right.left = new TreeNode(5);
        binary_ancestorOfANode.root.left.right.right = new TreeNode(11);
        binary_ancestorOfANode.root.left.left = new TreeNode(10);

        binary_ancestorOfANode.root.right = new TreeNode(9);
        binary_ancestorOfANode.root.right.right = new TreeNode(3);

        TreeNode sibling = binary_ancestorOfANode.getSibling(binary_ancestorOfANode.root, 9);
        if (sibling != null) {
            System.out.println("sibling is : " + sibling.data);
        } else {
            System.out.println("sibling not found ");
        }
    }
}

