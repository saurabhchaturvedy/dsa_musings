package com.dsa.saurabh.level01.Tree_CS;

import java.util.*;

public class BinaryTree_AllNodesAtDistanceK {

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

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            TreeNode treeNode = (TreeNode) o;
//            return data == treeNode.data &&
//                    Objects.equals(left, treeNode.left) &&
//                    Objects.equals(right, treeNode.right);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(data, left, right);
//        }
    }


//    private List<Integer> nodesAtDistanceK(TreeNode root, TreeNode targetNode, int K) {
//        List<Integer> nodeList = new ArrayList<>();
//        if (root == null) return nodeList;
//
//        Map<TreeNode, TreeNode> childParentMap = new HashMap<>();
//        createChildParentMap(childParentMap, root);
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        HashSet<TreeNode> visited = new HashSet<>();
//        nodeQueue.offer(targetNode);
//
//        while (!nodeQueue.isEmpty()) {
//            for (int i = 0; i < nodeQueue.size(); i++) {
//                TreeNode temp = nodeQueue.poll();
//                visited.add(temp);
//                if (K == 0) {
//                    nodeList.add(temp.data);
//                }
//                if (childParentMap.containsKey(temp) && !visited.contains(childParentMap.get(temp))) {
//                    nodeQueue.offer(childParentMap.get(temp));
//                }
//
//                if (temp.left != null && !visited.contains(temp.left)) {
//                    nodeQueue.offer(temp.left);
//                }
//
//                if (temp.right != null && !visited.contains(temp.right)) {
//                    nodeQueue.offer(temp.right);
//                }
//            }
//            K--;
//            if (K < 0) break;
//        }
//        return nodeList;
//    }

    public List<Integer> nodesAtDistanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> res= new ArrayList<>();
        if(root == null) return res;
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        createChildParentMap(parentMap, root);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        q.add(target);

        while(!q.isEmpty()){
            int size= q.size();
            for(int i =0; i <size; i++){
                TreeNode curr = q.poll();
                visited.add(curr);
                if(K == 0){
                    res.add(curr.data);
                }
                if(parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))){
                    q.add(parentMap.get(curr));
                }

                if(curr.left != null && !visited.contains(curr.left)){
                    q.add(curr.left);
                }

                if(curr.right != null && !visited.contains(curr.right)){
                    q.add(curr.right);
                }
            }
            K--;
            if(K < 0) break;
        }
        return res;
    }

    private void createChildParentMap(Map<TreeNode, TreeNode> createChildParentMap, TreeNode root) {
        if (root == null) return;

        if (root.left != null) {
            createChildParentMap.put(root.left, root);
        }
        if (root.right != null) {
            createChildParentMap.put(root.right, root);
        }

        createChildParentMap(createChildParentMap, root.left);
        createChildParentMap(createChildParentMap, root.right);
        return;
    }


    public static void main(String[] args) {

        BinaryTree_AllNodesAtDistanceK binaryTree_allNodesAtDistanceK = new BinaryTree_AllNodesAtDistanceK();
        binaryTree_allNodesAtDistanceK.root = new TreeNode(2);
        binaryTree_allNodesAtDistanceK.root.left = new TreeNode(7);
        binaryTree_allNodesAtDistanceK.root.left.left = new TreeNode(3);
        binaryTree_allNodesAtDistanceK.root.left.left.left = new TreeNode(8);
        binaryTree_allNodesAtDistanceK.root.right = new TreeNode(9);


        int K = 2;

        System.out.println("Nodes at distance k from node "+binaryTree_allNodesAtDistanceK.root.left.data+" are : "+binaryTree_allNodesAtDistanceK.nodesAtDistanceK(binaryTree_allNodesAtDistanceK.root,binaryTree_allNodesAtDistanceK.root.left,2 ));

    }
}
