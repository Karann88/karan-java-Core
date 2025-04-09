package LinkedList;

// Questions output
public class Main1 {
    public static void main(String[] args) {
        // Remove duplicates from the sorted list

        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        // list.insertLast(3);
        list.display();
        // list.removeDuplicates();
        // list.display();

        // LL first = new LL();
        // LL second = new LL();

        // first.insertLast(1);
        // first.insertLast(3);
        // first.insertLast(5);

        // second.insertLast(1);
        // second.insertLast(3);
        // second.insertLast(7);
        // second.insertLast(9);

        // LL ans = LL.merge(first, second);
        // ans.display();

        // Bubble Sort
        // LL list = new LL();
        // for (int i = 5; i > 0; i--) {
        // list.insertLast(i);
        // }
        // list.display();
        // list.bubbleSort();
        // list.display();

        // LL list = new LL();
        // list.insertLast(5);
        // list.insertLast(4);
        // list.insertLast(3);
        // list.insertLast(2);
        // list.insertLast(1);
        // list.display();

        // list.reverse();
        // list.display();

        // list.rev();
        // list.display();

        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(4);
        // list.insertLast(5);
        // list.insertLast(6);
        // list.insertLast(7);
        // list.display();

        // list.reverseBetween();
        // list.display();

        // Palindrome solution
        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(3);
        // list.insertLast(2);
        // list.insertLast(1);
        // list.display();

        // list.middleNode();
        // list.display();

        // list.isPalindrome();
        // list.display();

        // list.reorderList();
        // list.display();

        list.reverseKGroup();
        list.display();

        // list.reverseAlternateKGroup();
        // list.display();

        // list.rotateRight();
        // list.display();
    
    }
}
