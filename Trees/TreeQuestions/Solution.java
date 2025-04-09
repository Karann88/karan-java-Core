// package Trees.TreeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public Solution() {
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        // int height;

        public TreeNode(int val) {
            this.val = val;
        }

        // public TreeNode(int val, TreeNode left, TreeNode right) {
        // this.val = val;
        // this.left = left;
        // this.right = right;
        // }
    }

    private TreeNode root;

    public void isBalanced(Integer[] nums) {
        root = constructTree(nums, 0);
        System.out.println(isBalanced(root));
    }

    private boolean isBalanced(TreeNode node) {
        if (node == null)
            return true;
        // int leftHeight = height(node.left);
        // int rightHeight = height(node.right);
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    private TreeNode constructTree(Integer[] nums, int index) {
        if (index >= nums.length || nums[index] == null) {
            return null;
        }
        TreeNode node = new TreeNode(nums[index]);
        node.left = constructTree(nums, 2 * index + 1);
        node.right = constructTree(nums, 2 * index + 2);
        return node;
    }

    // hasPathSum method to check if the tree has a path with the given sum
    public boolean hasPathSum(TreeNode node, int sum) {
        if (node == null) {
            return sum == 0;
        }
        sum -= node.val;
        if (node.left == null && node.right == null) {
            return sum == 0;
        }
        return hasPathSum(node.left, sum) || hasPathSum(node.right, sum);
    }

    public static void main(String[] args) {
        /*
         * Integer[] nums = { 1, 2, 2, 3, 3, null, null, 4, 4 };
         * Solution s = new Solution();
         * s.isBalanced(nums);
         */

    }

    // 108. Convert Sorted Array to Binary Search Tree
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, left, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, right);
        return node;
    }

    // Balance a Binary Search Tree
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        inorderTraversal(root, list);
        return sortedListToBST(list, 0, list.size() - 1);
    }

    private void inorderTraversal(TreeNode node, List<TreeNode> list) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, list);
        list.add(node);
        inorderTraversal(node.right, list);
    }

    private TreeNode sortedListToBST(List<TreeNode> list, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = list.get(mid);
        node.left = sortedListToBST(list, left, mid - 1);
        node.right = sortedListToBST(list, mid + 1, right);
        return node;
    }

    // COnvert Sorted List to Binary Search Tree
    public TreeNode sortedListToBST(ListNode head) {
        List<TreeNode> list = new ArrayList<>();
        while (head != null) {
            list.add(new TreeNode(head.val));
            head = head.next;
        }
        return sortedListToBST(list, 0, list.size() - 1);
        }
        
        public TreeNode sortedListToBST(List<TreeNode> list, int left, int right) {
            if (left > right) {
                return null;
            }
            int mid = left + (right - left) / 2;
            TreeNode node = list.get(mid);
            node.left = sortedListToBST(list, left, mid - 1);
            node.right = sortedListToBST(list, mid + 1, right);
            return node;
        }
        public class ListNode {
            int val;
            ListNode next;
        
            ListNode(int x) {
                val = x;
            }
        }
}
