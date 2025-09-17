import java.util.ArrayList;
import java.util.List;

public class kk {

    private ListNode head;
    private ListNode tail;

    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode middleNode(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        head = slow; // Update head to point to the middle node
        return head;
    }

    public void middleNode() {
        middleNode(head);
    }

    public static void main(String[] args) {
        kk list = new kk();
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.display();

        list.middleNode();
        list.display();

    }

    // Length of the cycle
    public int lenOfCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;

            if (s == f) {
                ListNode temp = s;
                int len = 0;
                while (temp != null) {
                    temp = temp.next;
                    len++;
                }
                return len;
            }
        }
        return 0;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/
    public static ListNode detectCycle(ListNode head) {
        int len = 0;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                len = lenOfCycle(slow);
                break;
            }
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (len > 0) {
            s = s.next;
            len--;
        }

        // Keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public void detectCycle() {
        detectCycle(head);
    }

    // https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
    public ListNode deleteMiddle(ListNode head) {
        // ListNode slow = head;
        // ListNode fast = head;
        // ListNode prev = null;

        // while (fast != null && fast.next != null) {
        // fast = fast.next.next;
        // prev = slow;
        // slow = slow.next;
        // }
        // prev.next = slow.next;
        // return head;

        // ListNode mid = gitMid(head);
        // ListNode dummy = new ListNode(0, head);
        // ListNode temp = dummy;

        // while (temp.next != null) {
        // if (temp.next != mid) {
        // temp = temp.next;
        // } else {
        // temp.next = temp.next.next;
        // }
        // }
        // return dummy.next;
        // }

        // public ListNode gitMid(ListNode head) {
        // if (head == null || head.next == null) return null;

        // ListNode slow = head;
        // ListNode fast = head;

        // while (fast != null && fast.next != null) {
        // slow = slow.next;
        // fast = fast.next.next;
        // }
        // return slow;
        // }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // https://www.naukri.com/code360/problems/path-in-a-tree_3843990?leftPanelTabValue=PROBLEM

    ArrayList<Integer> path = new ArrayList<>();    
    ArrayList<Integer> ans = new ArrayList<>();

    public void dfs(TreeNode root, int x) {
        path.add(root.data);
        if(root.data == x)  ans = path;
        dfs(root.left, x);
        dfs(root.right, x);
        path.remove(path.size() - 1);
    }

    public ArrayList<Integer> pathInATree(TreeNode root, int x) {
        dfs(root, x);
        return ans;
    }

}
