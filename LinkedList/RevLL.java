package LinkedList;
public class RevLL {

    private Node head;
    private Node tail;
    public int size;

    public RevLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            size++;
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        node.next = null;
        tail = node;
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
        // node.next = temp.next.next;
        size++;
    }

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

    public void removeDup() {
        Node node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;

            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static RevLL mergeSort(RevLL first, RevLL second) {
        Node f = first.head;
        Node s = second.head;

        RevLL num = new RevLL();
        while (f != null && s != null) {
            if (f.val < s.val) {
                num.insertLast(f.val);
                f = f.next;
            } else {
                num.insertLast(s.val);
                s = s.next;
            }
        }
        while (f != null) {
            num.insertLast(f.val);
            f = f.next;
        }
        while (s != null) {
            num.insertLast(s.val);
            s = s.next;
        }
        return num;
    }

    // Cycle detection
    public boolean cycleDetection() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Length of the cycle
    public int lenCycle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            // calculate the length of the cycle
            if (fast == slow) {
                Node temp = slow;
                int len = 0;
                do {
                    temp = temp.next;
                    len++;
                } while (temp != slow);
                return len;
            }
        }
        return 0;
    }

    public boolean isHappy(int ans) {
        int fast = ans;
        int slow = ans;

        do {
            fast = findSquare(findSquare(ans));
            slow = findSquare(ans);
        } while (fast != slow);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    public int findSquare(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

    public void isHappy() {
        isHappy(12);
    }

    public Node middleList(Node node) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        head = slow;
        return slow;
    }

    public void middleList() {
        middleList(head);
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val) {
                // Swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second = tail;
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

    public void rev(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        rev(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void rev() {
        rev(head);
    }

    public Node reverse(Node node) {
        if (node == null) {
            return head;
        }
        // if (size < 2) {
        // return;
        // }

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

    public void reverse() {
        reverse(head);
    }

    public void subLL(int left, int right) {
        Node pres = head;
        Node prev = null;

        for (int i = 0; i < left - 1; i++) {
            if (pres != null) {
                prev = pres;
                pres = pres.next;
            }
        }
        Node last = prev;
        Node newEnd = pres;

        Node next = pres.next;
        for (int i = 0; pres != null && i < right - left + 1; i++) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = pres;
    }

    public void subLL() {
        subLL(1, 4);
    }

    public boolean isPalindrome(Node node) {
        Node mid = middleList(node);
        Node headSecond = reverse(mid);
        Node rereverseHead = headSecond;

        // Compare both the halves
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        rev(rereverseHead);

        if (head == null || headSecond == null) {
            return true;
        }
        return false;
    }

    public void isPalindrome() {
        System.out.println(isPalindrome(head));
    }

    public void reorderList(Node node) {
        if (node == null || node.next == null) {
            return;
        }

        Node mid = middleList(node);
        Node hs = reverse(mid);
        Node hf = node;

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

    public Node reverseKGroup(int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        Node current = head;
        Node prev = null;

        while (true) {
            Node last = prev;
            Node newEnd = current;
            Node next = current.next;

            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;

            if (current == null) {
                break;
            }
            prev = newEnd;
        }
        return head;
    }

    public Node reverseAlternateKGroup(int k) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node last = prev;
            Node newEnd = current;
            Node next = current.next;

            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;

            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public void rotateRight(int k) {
        if (head == null || head.next == null || k == 0) {
            return;
        }

        Node last = head;
        int len = 1;
        while (last.next != null) {
            last = last.next;
            len++;
        }
        last.next = head;
        int rotations = k % len;
        int skip = len - rotations;

        Node newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;   
        }
        head = newLast.next;
        newLast.next = null;

    }

    public static void main(String[] args) {
        RevLL list = new RevLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        // list.insertLast();
        // list.insert(45, 3);
        // list.insertRec(44, 3);
        // list.display();

        // list.removeDup();
        // list.display();

        // RevLL first = new RevLL();
        // RevLL second = new RevLL();

        // first.insertLast(1);
        // first.insertLast(3);
        // first.insertLast(5);

        // second.insertLast(1);
        // second.insertLast(3);
        // second.insertLast(7);
        // second.insertLast(9);

        // RevLL num = RevLL.mergeSort(first, second);
        // num.display();

        // System.out.println(list.cycleDetection());
        // System.out.println(list.lenCycle());

        // list.isHappy();

        // list.middleList();
        // list.display();

        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(4);
        // list.insertLast(5);
        // list.display();

        // list.bubbleSort();
        // list.display();

        // list.reverse();
        // list.display();

        list.rev();
        list.display();

        // list.subLL();
        // list.display();

        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(2);
        // list.insertLast(1);
        // list.display();

        // list.isPalindrome();
        // list.display();
        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(4);
        // list.insertLast(5);
        // list.insertLast(6);
        // list.insertLast(7);
        // list.insertLast(8);
        // list.insertLast(9);
        // list.display();

        // list.reorderList();
        // list.display();

        // list.reverseKGroup(3);
        // list.display();

        // list.reverseAlternateKGroup(3);
        // list.display();

        // list.rotateRight(2);
        // list.display();
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
