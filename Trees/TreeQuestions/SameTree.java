// package Trees.TreeQuestions;

import java.util.ArrayList;
import java.util.List;

public class SameTree {

    public SameTree() {
    }

    class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // same Tree
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        preorder(p, list1);
        preorder(q, list2);
        return list1.equals(list2);
    }

    public void preorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }

    public static void main(String[] args) {
        SameTree tree = new SameTree();
        int[] p = { 1, 2 };
        int[] q = { 1, 3, 2 };
        // tree.isSameTree(p, q);

    }
}