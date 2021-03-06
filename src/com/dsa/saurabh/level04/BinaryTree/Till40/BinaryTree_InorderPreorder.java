package com.dsa.saurabh.level04.BinaryTree.Till40;

public class BinaryTree_InorderPreorder {

    TreeNode root;

    int preIndex = 0;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private TreeNode constructTreeFromPreorderInOrder(int[] preOrderArray, int[] inorderArray, int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode node = new TreeNode(preOrderArray[preIndex++]);

        if (start == end) {
            return node;
        }

        int inorderIndex = findInorderIndex(node.data, inorderArray);

        node.left = constructTreeFromPreorderInOrder(preOrderArray, inorderArray, start, inorderIndex - 1);
        node.right = constructTreeFromPreorderInOrder(preOrderArray, inorderArray, inorderIndex + 1, end);

        return node;
    }

    private int findInorderIndex(int data, int[] inorderArray) {

        for (int i = 0; i < inorderArray.length; i++) {
            if (inorderArray[i] == data) {
                return i;
            }
        }

        return -1;
    }

    private void display(TreeNode node) {
        if (node == null) return;
        display(node.left);
        System.out.print(node.data + " ");
        display(node.right);
    }

    private void displayPre(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.left);
        display(node.right);
    }


    public static void main(String[] args) {
        int preorderArray[] = {2, 4, 7, 3, 8};
        int inorderArray[] = {7, 4, 3, 2, 8};

        BinaryTree_InorderPreorder binaryTree_inorderPreorder = new BinaryTree_InorderPreorder();
        TreeNode treeNode = binaryTree_inorderPreorder.constructTreeFromPreorderInOrder(preorderArray, inorderArray, 0, inorderArray.length - 1);

        binaryTree_inorderPreorder.display(treeNode);
        System.out.println();
        binaryTree_inorderPreorder.displayPre(treeNode);
    }
}
