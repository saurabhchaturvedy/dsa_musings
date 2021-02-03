package com.dsa.saurabh.level01.Tree_CS;

public class BinarySearchTree_LCA {

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


    private TreeNode insert(TreeNode root, int data) {
        if (root == null) {

            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    private void insert(int data) {
        root = insert(root, data);
    }

    private TreeNode min(TreeNode node) {
        if (node.left != null) return min(node.left);
        return node;
    }

    private TreeNode max(TreeNode node) {
        if (node.right != null) return max(node.right);
        return node;
    }

    private TreeNode get(TreeNode root, int data) {
        if (root == null || root.data == data) return this.root;

        if (data < root.data) {
            return get(root.left, data);
        }
        return get(root.right, data);
    }


    private TreeNode lca(TreeNode node, int n1, int n2) {
        if (node == null) return null;

        while (node != null) {
            if (node.data > n1 && node.data > n2) {
                node = node.left;
            } else if (node.data < n1 && node.data < n2) {
                node = node.right;
            } else {
                break;
            }

        }

        return node;
    }


    public static void main(String[] args) {
        BinarySearchTree_LCA binarySearchTree_lca = new BinarySearchTree_LCA();
        binarySearchTree_lca.insert(8);
        binarySearchTree_lca.insert(6);
        binarySearchTree_lca.insert(15);
        binarySearchTree_lca.insert(2);
        binarySearchTree_lca.insert(7);
        binarySearchTree_lca.insert(13);
        binarySearchTree_lca.insert(20);

        System.out.println("Minimum value is : " + binarySearchTree_lca.min(binarySearchTree_lca.root).data);
        System.out.println("Maximum value is : " + binarySearchTree_lca.max(binarySearchTree_lca.root).data);
        System.out.println("Maximum value is : " + binarySearchTree_lca.get(binarySearchTree_lca.root, 50) != null ? "Node found" : "Node not found");
        TreeNode lca = binarySearchTree_lca.lca(binarySearchTree_lca.root, 2, 7);
        System.out.println("LCA is : " + lca.data);

    }
}
