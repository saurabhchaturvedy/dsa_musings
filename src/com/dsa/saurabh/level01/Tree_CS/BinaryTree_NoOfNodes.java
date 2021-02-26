package com.dsa.saurabh.level01.Tree_CS;
//19
public class BinaryTree_NoOfNodes {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private int noOfNodes(TreeNode node) {
        if (node == null) return 0;
        return 1 + noOfNodes(node.left) + noOfNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree_NoOfNodes binaryTree_noOfNodes = new BinaryTree_NoOfNodes();
        binaryTree_noOfNodes.root = new TreeNode(10);
        binaryTree_noOfNodes.root.left = new TreeNode(20);
        binaryTree_noOfNodes.root.right = new TreeNode(30);

        System.out.println("No. of nodes are : " + binaryTree_noOfNodes.noOfNodes(binaryTree_noOfNodes.root));

    }
}
