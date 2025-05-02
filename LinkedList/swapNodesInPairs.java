package LinkedList;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int val) {
//        this.val = val;
//        this.next = null;
//    }
//}

public class swapNodesInPairs {

    // Function to reverse the linked list
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Function to swap nodes in pairs
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Find the middle of the list
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse the second half of the list
        ListNode secondHalf = reverseList(slow.next);
        slow.next = null;
        
        // Reverse the entire list
        ListNode reversedHead = reverseList(head);
        
        // Swap nodes in pairs
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (reversedHead != null && reversedHead.next != null) {
            ListNode first = reversedHead;
            ListNode second = reversedHead.next;
            
            // Swap the nodes
            current.next = second;
            first.next = second.next;
            second.next = first;
            
            // Move to the next pair
            current = first;
            reversedHead = first.next;
        }
        
        // If there is an odd number of nodes, attach the last node
        if (reversedHead != null) {
            current.next = reversedHead;
        }
        
        // Reverse the list again to restore the original order but with pairs swapped
        return reverseList(dummy.next);
    }

    // Helper function to create a linked list from an array of values
    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper function to print the linked list
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        ListNode head = createLinkedList(values);
        System.out.println("Original list:");
        printLinkedList(head);

        ListNode swappedHead = swapPairs(head);
        System.out.println("List after swapping pairs:");
        printLinkedList(swappedHead);
    }
}
