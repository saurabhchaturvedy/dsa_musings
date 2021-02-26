package com.dsa.saurabh.level01.Tree_CS;
//6
public class BinaryTree_CheckIfSubtree {

    private TreeNode root;

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

    private boolean areIdentical(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        return (node1.data == node2.data && areIdentical(node1.left, node2.left) && areIdentical(node1.right, node2.right));
    }

    private boolean isSubtree(TreeNode T, TreeNode S) {
        if (T == null) return false;
        if (S == null) return true;

        if (areIdentical(T, S)) return true;

        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }

    public static void main(String[] args) {
        BinaryTree_CheckIfSubtree binaryTree_checkIfSubtree = new BinaryTree_CheckIfSubtree();
        binaryTree_checkIfSubtree.root = new TreeNode(26);
        binaryTree_checkIfSubtree.root.left = new TreeNode(10);
        binaryTree_checkIfSubtree.root.left.right = new TreeNode(6);
        binaryTree_checkIfSubtree.root.left.left = new TreeNode(4);
        binaryTree_checkIfSubtree.root.left.left.right = new TreeNode(30);
        binaryTree_checkIfSubtree.root.right = new TreeNode(3);
        binaryTree_checkIfSubtree.root.right.right = new TreeNode(3);

        TreeNode first = new TreeNode(10);
        TreeNode second = new TreeNode(4);
        TreeNode third = new TreeNode(6);
        TreeNode fourth = new TreeNode(30);

        first.left = second;
        first.right = third;
        second.right = fourth;

        System.out.println("is subtree => " + binaryTree_checkIfSubtree.isSubtree(binaryTree_checkIfSubtree.root, first));
    }
}
