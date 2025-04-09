package Trees;

public class BST {

    public BST() {
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height; // Property of the Node

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // public void display() {
    // display(this.root, "Root Node: ");
    // }

    // public void display(Node node, String details) {
    // if (node == null) {
    // return;
    // }
    // System.out.println(details + node.getValue());

    // display(node.left, "Left child of " + node.getValue() + " : ");
    // display(node.right, "Right child of " + node.getValue() + " : ");
    // }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    // for Sorted Array:- If we perform simple BST method it'll be O(n^2) time complexity and skewed tree.
    // So we need to use the divide and conquer method to make it O(n) time complexity.
    // This method will create a balanced BST.
    // 1. Find the middle element of the array.
    // 2. Insert the middle element into the BST.
    // 3. Recursively do the same for the left half and right half of the array.
    // 4. The base case for the recursion is when the start index is greater than the end index.
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
}
