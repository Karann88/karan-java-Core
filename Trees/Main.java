package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Scanner scanner = new Scanner(System.in);
         * BinaryTree tree = new BinaryTree();
         * tree.populate(scanner);
         * tree.prettyDisplay();
         * tree.preOrder();
         */

        // BST tree = new BST();
        // int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        // populate sorted
        // int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // tree.populateSorted(nums);
        // tree.display();

        // AVL tree = new AVL();

        // tree.insert(10);
        // tree.insert(20);
        // tree.insert(15);
        // System.out.println(tree.height());

        int[] arr = { 3, 8, 7, 6, -2, -8, 4, 9 };

        SegmentTree tree = new SegmentTree(arr);
        tree.display();
        // System.out.println(tree.query(2,6));

        
    }
}
