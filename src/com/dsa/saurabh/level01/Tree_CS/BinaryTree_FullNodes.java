package com.dsa.saurabh.level01.Tree_CS;
//9
public class BinaryTree_FullNodes {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    private static void printFullNodes(TreeNode node) {
        if (node == null) return;

        printFullNodes(node.left);
        if (node.left != null && node.right != null) {
            System.out.print(node.data + " ");
        }
        printFullNodes(node.right);
    }


    public static void main(String[] args) {
        BinaryTree_FullNodes binaryTree_fullNodes = new BinaryTree_FullNodes();
        binaryTree_fullNodes.root = new TreeNode(23);
        binaryTree_fullNodes.root.left = new TreeNode(19);
        binaryTree_fullNodes.root.left.left = new TreeNode(13);
        binaryTree_fullNodes.root.left.right = new TreeNode(22);
        binaryTree_fullNodes.root.right = new TreeNode(31);
        binaryTree_fullNodes.root.right.left = new TreeNode(28);
        binaryTree_fullNodes.root.right.right = new TreeNode(41);

        printFullNodes(binaryTree_fullNodes.root);
    }
}
