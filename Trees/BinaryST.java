package Trees;

public class BinaryST {
    // public BinaryST() {
    // }

    // private class Node {
    // private int value;
    // private Node left;
    // private Node right;
    // private int height;

    // public Node(int value) {
    // this.value = value;
    // }
    // }

    // public boolean isEmpty() {
    // return root == null;
    // }

    // public int height(Node node) {
    // if (node == null) {
    // return -1;
    // }
    // return node.height;
    // }

    // private Node root;

    // public void insert(int value) {
    // root = insert(value, root);
    // }

    // public Node insert(int value, Node node) {
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
    // return node;
    // }

    // public void populate(int[] nums) {
    // for (int i = 0; i < nums.length; i++) {
    // this.insert(nums[i]);
    // }
    // }

    // public void populateSorted(int[] nums) {
    // populateSorted(nums, 0, nums.length - 1);
    // }

    // public void populateSorted(int[] nums, int start, int end) {
    // if (start > end) {
    // return;
    // }
    // int mid = (start + end) / 2;

    // this.insert(nums[mid]);
    // populateSorted(nums, start, mid);
    // populateSorted(nums, mid + 1, end);
    // }

    // public void display() {
    // display(this.root, "Root Node: ");
    // }

    // private void display(Node node, String details) {
    // if (node == null) {
    // return;
    // }
    // System.out.println(details + node.value);

    // display(node.left, "Left child of " + node.value + " : ");
    // display(node.right, "Right child of " + node.value + " : ");
    // }

    public class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
            this.height = 1;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private Node root;

    public int getHeight(Node node) {
        return node == null ? 0 : node.height;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    public Node insert(int val, Node node) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.val) {
            node.left = insert(val, node.left);
        }
        if (val > node.val) {
            node.right = insert(val, node.right);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    public void populate(Integer[] nums) {
        for (Integer num : nums) {
            if (num != null) {
                insert(num);
            }
        }
    }

    public void display() {
        display(root, "Root node : ");
    }

    public void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);

        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }

    public static void main(String[] args) {
        BinaryST tree = new BinaryST();
        Integer[] nums = { 5, 2, 6, null, 7, null, 1, 3, 4, null };
        tree.populate(nums);
        tree.display();
    }
}
