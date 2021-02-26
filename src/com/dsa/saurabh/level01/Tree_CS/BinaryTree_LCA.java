package com.dsa.saurabh.level01.Tree_CS;
//13
public class BinaryTree_LCA {


    TreeNode root;
    static boolean isN1found;
    static boolean isN2found;


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

    private static TreeNode lca(TreeNode node, int n1, int n2) {

        TreeNode lca = lcaFinder(node, n1, n2);
        if (isN1found && isN2found) {
            return lca;
        } else {
            return null;
        }

    }

    private static TreeNode lcaFinder(TreeNode node, int n1, int n2) {
        if (node == null) return null;

        if (node.data == n1) {
            isN1found = true;
            return node;
        }

        if (node.data == n2) {
            isN2found = true;
            return node;
        }

        TreeNode leftLCA = lcaFinder(node.left, n1, n2);
        TreeNode rightLCA = lcaFinder(node.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return node;
        }

        return leftLCA != null ? leftLCA : rightLCA;
    }

    public static void main(String[] args) {
        BinaryTree_LCA binaryTree_lca = new BinaryTree_LCA();
        binaryTree_lca.root = new TreeNode(2);
        binaryTree_lca.root.right = new TreeNode(9);
        binaryTree_lca.root.right.right = new TreeNode(3);

        binaryTree_lca.root.left = new TreeNode(7);
        binaryTree_lca.root.left.right = new TreeNode(6);
        binaryTree_lca.root.left.right.right = new TreeNode(11);
        binaryTree_lca.root.left.right.left = new TreeNode(5);
        binaryTree_lca.root.left.left = new TreeNode(10);

        System.out.println("LCA is : " + lca(binaryTree_lca.root, 6, 3).data);


    }
}
