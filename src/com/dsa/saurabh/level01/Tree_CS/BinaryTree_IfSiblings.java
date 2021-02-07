package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_IfSiblings {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    public boolean areSiblings(TreeNode node, TreeNode a, TreeNode b) {
        if (node == null) {
            return false;
        }

        return (node.left == a && node.right == b)
                || (node.left == b && node.right == a)
                || areSiblings(node.left, a, b)
                || areSiblings(node.right, a, b);
    }


    public static void main(String[] args) {
        BinaryTree_IfSiblings binary_ancestorOfANode = new BinaryTree_IfSiblings();
        binary_ancestorOfANode.root = new TreeNode(2);
        binary_ancestorOfANode.root.left = new TreeNode(7);
        binary_ancestorOfANode.root.left.right = new TreeNode(6);
        binary_ancestorOfANode.root.left.right.left = new TreeNode(5);
        binary_ancestorOfANode.root.left.right.right = new TreeNode(11);
        binary_ancestorOfANode.root.left.left = new TreeNode(10);

        binary_ancestorOfANode.root.right = new TreeNode(9);
        binary_ancestorOfANode.root.right.right = new TreeNode(3);

        boolean areSiblings = binary_ancestorOfANode.areSiblings(binary_ancestorOfANode.root, binary_ancestorOfANode.root.left.right.left, binary_ancestorOfANode.root.left.right.right);
        if (areSiblings) {
            System.out.println(areSiblings);
        } else {
            System.out.println("nodes are not siblings ");
        }
    }
}

