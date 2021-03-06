package com.dsa.saurabh.level04.BinaryTree.Till40;

public class BinaryTree_FoldableTree {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean isMirrorStructure(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        return isMirrorStructure(first.left, second.right) && isMirrorStructure(first.right, second.left);
    }


    private boolean isFoldableTree(TreeNode node) {
        if (node == null)
            return true;

        return isMirrorStructure(node.left, node.right);
    }


    private void add(TreeNode parent, TreeNode child, String childType) {
        if (childType.equals("l")) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }

    public static void main(String[] args) {
        BinaryTree_FoldableTree binaryTree_foldableTree = new BinaryTree_FoldableTree();
        binaryTree_foldableTree.root = new TreeNode(10);

        TreeNode first = new TreeNode(5);
        TreeNode second = new TreeNode(8);

        binaryTree_foldableTree.add(binaryTree_foldableTree.root, first, "l");
        binaryTree_foldableTree.add(binaryTree_foldableTree.root, second, "r");

        TreeNode third = new TreeNode(6);
        TreeNode fourth = new TreeNode(12);

        binaryTree_foldableTree.add(first, third, "l");
        binaryTree_foldableTree.add(second, fourth, "r");

        boolean foldableTree = binaryTree_foldableTree.isFoldableTree(binaryTree_foldableTree.root);

        System.out.println("Is this a foldable tree ? : "+foldableTree);

    }
}
