package com.dsa.saurabh.level01.Tree_CS;
//17
public class BinaryTree_NodesAtDistanceK {


    TreeNode root;

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private int printNodesAtDistanceK(TreeNode node, TreeNode targetNode, int k) {
        if (root == null || node == null || k < 0) return -1;

        return printNodesAtK(node, targetNode, k);

    }

    private int printNodesAtK(TreeNode node, TreeNode targetNode, int k) {
        if (root == null) return -1;

        if (node == targetNode) {
            printNodesAtLevelK(targetNode, k);
            return 0;
        }

        int leftDistance = printNodesAtDistanceK(node.left, targetNode, k);

        if (leftDistance != -1) {
            if (leftDistance + 1 == k) {
                System.out.print(node.data + " ");
            } else {
                printNodesAtLevelK(node.right, k - 2 - leftDistance);
            }

            return leftDistance + 1;
        }

        int rightDistance = printNodesAtDistanceK(node.right, targetNode, k);

        if (rightDistance != -1) {
            if (rightDistance + 1 == k) {
                System.out.print(node.data + " ");
            } else {
                printNodesAtLevelK(node.left, k - 2 - rightDistance);
            }

            return rightDistance + 1;
        }

        return -1;
    }

    private void printNodesAtLevelK(TreeNode targetNode, int level) {
        if (targetNode == null) return;

        if (level == 0) {
            System.out.print(targetNode.data + " ");
            return;
        }

        printNodesAtLevelK(targetNode.left, level - 1);
        printNodesAtLevelK(targetNode.right, level - 1);
    }

    public static void main(String[] args) {
        BinaryTree_NodesAtDistanceK binaryTree_nodesAtDistanceK = new BinaryTree_NodesAtDistanceK();
        binaryTree_nodesAtDistanceK.root = new TreeNode(2);
        binaryTree_nodesAtDistanceK.root.left = new TreeNode(7);
        binaryTree_nodesAtDistanceK.root.left.left = new TreeNode(10);
        binaryTree_nodesAtDistanceK.root.right = new TreeNode(9);
        binaryTree_nodesAtDistanceK.root.right.right = new TreeNode(3);
        binaryTree_nodesAtDistanceK.root.left.right = new TreeNode(6);
        binaryTree_nodesAtDistanceK.root.left.right.right = new TreeNode(11);
        binaryTree_nodesAtDistanceK.root.left.right.left = new TreeNode(5);

        binaryTree_nodesAtDistanceK.printNodesAtDistanceK(binaryTree_nodesAtDistanceK.root, binaryTree_nodesAtDistanceK.root.left, 2);
    }
}
