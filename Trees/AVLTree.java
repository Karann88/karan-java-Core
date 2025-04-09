package Trees;

public class AVLTree {

    public AVLTree() {
    }

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
            this.height = 1;
        }
    }

    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    private int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // Get the balance factor of a node
    // private int getBalanceFactor(Node node) {
    // if (node == null) {
    // return 0;
    // }
    // return height(node.left) - height(node.right);
    // }

    // Left rotation
    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t2 = p.left;

        p.left = c;
        c.right = t2;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        return p;
    }

    // Right rotation
    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t2 = c.right;

        c.right = p;
        p.left = t2;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }

    // Rebalance the tree
    // private Node rebalance(Node node) {
    // // int balanceFactor = getBalanceFactor(node);

    // if (height(node.left) - height(node.right) > 1) {
    // if (height(node.left.left) - height(node.left.right) > 0) {
    // return rightRotate(node);
    // } else {
    // node.left = leftRotate(node.left);
    // return rightRotate(node);
    // }
    // } else if (height(node.left) - height(node.right) < -1) {
    // if (height(node.right.left) - height(node.right.right) < 0) {
    // return leftRotate(node);
    // } else {
    // node.right = rightRotate(node.right);
    // return leftRotate(node);
    // }
    // }
    // return node;
    // }

    // // Insert a new node
    // public void insert(int value) {
    // root = insert(value, root);
    // }

    // private Node insert(int value, Node node) {
    // if (node == null) {
    // node = new Node(value);
    // return node;
    // }
    // if (value < node.value) {
    // node.left = insert(value, node.left);
    // }
    // if (value > node.value) {
    // node.right = insert(value, node.right);
    // }
    // node.height = Math.max(height(node.left), height(node.right)) + 1;
    // return rebalance(node);
    // }

    // public static void main(String[] args) {
    // AVLTree tree = new AVLTree();

    // tree.insert(10);
    // tree.insert(20);
    // tree.insert(15);

    // System.out.println(tree.height());
    // }
}