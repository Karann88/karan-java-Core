// Removed package declaration

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    public BFS() {
    }

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    public List<List<Integer>> levelOrder() {
        return levelOrder(root);
    }

    private List<List<Integer>> levelOrder(Node node) {
        List<List<Integer>> result = new ArrayList<>();

        if (node == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.value);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    // Average of Levels Binary Tree
    // public List<Double> averageOfLevels() {
    // return averageOfLevels(root);
    // }

    // private List<Double> averageOfLevels(Node node) {
    // List<Double> result = new ArrayList<>();

    // if (node == null) {
    // return result;
    // }
    // Queue<Node> queue = new LinkedList<>();
    // queue.offer(node);

    // while (!queue.isEmpty()) {
    // int levelSize = queue.size();
    // double avgLevel = 0;
    // for (int i = 0; i < levelSize; i++) {
    // Node currentNode = queue.poll();
    // avgLevel += currentNode.value;

    // if (currentNode.left != null) {
    // queue.offer(currentNode.left);
    // }
    // if (currentNode.right != null) {
    // queue.offer(currentNode.right);
    // }
    // }
    // avgLevel = avgLevel / levelSize;
    // result.add(avgLevel);
    // }
    // return result;
    // }

    // Find successor
    // public Node findSuccessor() {
    // return findSuccessor(root, 14);
    // }

    // private Node findSuccessor(Node node, int key) {
    // if (node == null) {
    // return null;
    // }
    // Queue<Node> queue = new LinkedList<>();
    // queue.offer(node);

    // while (!queue.isEmpty()) {
    // int levelSize = queue.size();
    // Node currentNode = queue.poll();

    // if (currentNode.left != null) {
    // queue.offer(currentNode.left);
    // }
    // if (currentNode.right != null) {
    // queue.offer(currentNode.right);
    // }
    // if (currentNode.value == key) {
    // break;
    // }
    // }
    // return queue.peek();
    // }

    // Binary Tree ZigZag Level Order Traversal
    // public List<List<Integer>> zigzagLevelOrder() {
    // return zigzagLevelOrder(root);
    // }

    // private List<List<Integer>> zigzagLevelOrder(Node node) {
    // List<List<Integer>> result = new ArrayList<>();

    // if (node == null) {
    // return result;
    // }
    // Deque<Node> queue = new LinkedList<>();
    // queue.offer(node);

    // boolean reverse = false;

    // while (!queue.isEmpty()) {
    // int levelSize = queue.size();
    // List<Integer> currentLevel = new ArrayList<>(levelSize);
    // for (int i = 0; i < levelSize; i++) {

    // if (!reverse) {
    // Node currentNode = queue.pollFirst();
    // currentLevel.add(currentNode.value);
    // if (currentNode.left != null) {
    // queue.addLast(currentNode.left);
    // }
    // if (currentNode.right != null) {
    // queue.addLast(currentNode.right);
    // }
    // } else {
    // Node currentNode = queue.pollLast();
    // currentLevel.add(currentNode.value);
    // if (currentNode.right != null) {
    // queue.addFirst(currentNode.right);
    // }
    // if (currentNode.left != null) {
    // queue.addFirst(currentNode.left);
    // }
    // }
    // }
    // reverse = !reverse;
    // result.add(currentLevel);
    // }
    // return result;
    // }

    // Binary Tree LevelOrder Traversal
    // public List<List<Integer>> levelOrderBottom() {
    // return levelOrderBottom(root);
    // }

    // private List<List<Integer>> levelOrderBottom(Node node) {
    // List<List<Integer>> result = new ArrayList<>();

    // if (node == null) {
    // return result;
    // }
    // Deque<Node> queue = new LinkedList<>();
    // queue.offer(node);

    // while (!queue.isEmpty()) {
    // int levelSize = queue.size();
    // List<Integer> currentLevel = new ArrayList<>(levelSize);
    // for (int i = 0; i < levelSize; i++) {
    // Node currentNode = queue.poll();
    // currentLevel.add(currentNode.value);

    // if (currentNode.left != null) {
    // queue.offer(currentNode.left);
    // }
    // if (currentNode.right != null) {
    // queue.offer(currentNode.right);
    // }
    // }
    // result.add(0, currentLevel);
    // }
    // return result;
    // }

    // public void populate(Scanner sc) {
    // System.out.println("Enter the root node: ");
    // int value = sc.nextInt();
    // root = new Node(value);
    // populate(sc, root);
    // }

    // private void populate(Scanner sc, Node node) {
    // System.out.println("Do you want to enter the left of " + node.value);
    // boolean left = sc.nextBoolean();
    // if (left) {
    // System.out.println("Enter the value of left of " + node.value);
    // int value = sc.nextInt();
    // node.left = new Node(value);
    // populate(sc, node.left);
    // }
    // System.out.println("Do you want to enter the right of " + node.value);
    // boolean right = sc.nextBoolean();
    // if (right) {
    // System.out.println("Enter the value of right of " + node.value);
    // int value = sc.nextInt();
    // node.right = new Node(value);
    // populate(sc, node.right);
    // }
    // }

    // construct binary tree from preorder and inorder traversal
    /* public Node buildTree(int[] preorder, int[] inorder) {
        Queue<Integer> preorderQueue = new LinkedList<>();
        for (int val : preorder) {
            preorderQueue.offer(val);
        }

        List<Integer> inorderList = new ArrayList<>();
        for (int val : inorder) {
            inorderList.add(val);
        }
        return construct(preorderQueue, inorderList);
    }

    public Node construct(Queue<Integer> preorderQueue, List<Integer> list) {
    if (list.isEmpty()) {
        return null;
    }
    int rootVal = preorderQueue.poll();
    Node root = new Node(rootVal);

    int rootIndex = list.indexOf(rootVal);

    if (rootIndex == -1) {
        throw new RuntimeException("Root value not found in inorder list");
    }

    List<Integer> leftList = list.subList(0, rootIndex);
    List<Integer> rightList = list.subList(rootIndex + 1, list.size());

    root.left = construct(preorderQueue, leftList);
    root.right = construct(preorderQueue, rightList);

    return root;


    }
    public void buildTree() {
        buildTree(null, null);
    } */
}
