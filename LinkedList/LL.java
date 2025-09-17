package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // insertion using recursion.

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

        // Node temp = head;
        // if (head == null) {
        // tail = null;
        // }
        // head = temp.next;
        // size--;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;

        // if (size <= 1) {
        // deleteFirst();
        // }
        // Node secondLast = get(size - 2);
        // tail = secondLast;
        // tail.next = null;
        // return;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Questions

    public void removeDuplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // Merge
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return true;
    }

    // Find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // recursion reverse

    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverse() {
        reverse(head);
    }

    // In place reversal a linked list.
    private Node rev(Node node) {
        if (node == null) {
            return head;
        }
        // if (size < 2) {
        // return;
        // }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        // head = prev;
        return prev;
    }

    public void rev() {
        rev(head);
    }

    // Reverse a part of a linkedlist or Sub Linked list
    private Node reverseBetween(Node node, int left, int right) {
        if (left == right) {
            return head;
        }
        // Skip the first left-1 nodes
        Node present = node;
        Node prev = null;
        for (int i = 0; present != null && i < left - 1; i++) {
            prev = present;
            present = present.next;
        }
        Node last = prev;
        Node newEnd = present;

        // reverse between left and right
        Node next = present.next;
        for (int i = 0; present != null && i < right - left + 1; i++) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = present;
        return head;
    }

    public void reverseBetween() {
        reverseBetween(head, 2, 4);
    }

    // Palindrome Linked List
    public boolean isPalindrome(Node node) {
        Node mid = middleNode(node);
        Node headSecond = rev(mid);
        Node rereverseHead = headSecond;

        // Compare both the halves
        while (head != null && headSecond != null) {
            if (head.value != headSecond.value) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        rev(rereverseHead);

        return head == null || headSecond == null;
    }

    public void isPalindrome() {
        isPalindrome(head);
    }

    public Node middleNode(Node node) {
        Node s = node;
        Node f = node;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        head = s;
        return s;
    }

    public void middleNode() {
        middleNode(head);
    }

    // Reorder List
    public void reorderList(Node node) {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = middleNode(node);
        Node hs = rev(mid);
        Node hf = node;

        // Rearrange
        while (hf != null && hs != null) {
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
        head = node;
    }

    public void reorderList() {
        reorderList(head);
    }

    // Its also reversing the <k end items -> modify it accordingly.
    public Node reverseKGroup(Node node, int k) {
        if (k <= 1 || node == null) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = node;
        Node prev = dummy;
        Node present = node;

        int remainingLen = getLen(head);

        while (remainingLen >= k) {
            Node last = prev;
            Node newEnd = present;

            // reverse between left and right
            Node next = present.next;
            for (int i = 0; (present != null) && i < k; i++) {
                present.next = prev.next;
                prev.next = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
            }

            last.next = prev.next;
            newEnd.next = present;
            prev = newEnd;

            remainingLen = remainingLen - k;
        }
        return dummy.next;
    }

    public int getLen(Node head) {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public void reverseKGroup() {
        reverseKGroup(head, 3);
    }

    // Alternate k group
    public Node reverseAlternateKGroup(Node node, int k) {
        if (k <= 1 || node == null) {
            return head;
        }

        Node present = node;
        Node prev = null;

        while (present != null) {
            Node last = prev;
            Node newEnd = present;

            // reverse between left and right
            Node next = present.next;
            for (int i = 0; present != null && i < k; i++) {
                present.next = prev;
                prev = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = present;
            // skip the k nodes
            for (int i = 0; present != null && i < k; i++) {
                prev = present;
                present = present.next;
            }
        }
        return head;
    }

    public void reverseAlternateKGroup() {
        reverseAlternateKGroup(head, 3);
    }

    // Rotate List
    public Node rotateRight(Node node, int k) {
        if (k <= 0 || node == null || node.next == null) {
            return head;
        }
        Node last = node;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;

        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }

    public void rotateRight() {
        rotateRight(head, 2);
    }
}
