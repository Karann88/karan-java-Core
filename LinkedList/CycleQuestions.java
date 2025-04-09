package LinkedList;

import java.util.List;

public class CycleQuestions {
    private ListNode head;

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
        return false;
    }

    // Find len of the cycle
    public int lenCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the len
                ListNode temp = slow;
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

    public ListNode detectCycle(ListNode head) {   
        int len = 0;   
        ListNode fast = head;   
        ListNode slow = head;   

        while (fast != null && fast.next != null) {   
            fast = fast.next.next;   
            slow = slow.next;   
            if (fast == slow) {   
                len = lenCycle(slow);   
                break;   
            }
        }

        if (len ==0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (len > 0) {
            s = s.next;
            len--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        } 
        return false;
    }

    private int findSquare(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    public ListNode middleNode(ListNode node) {
        ListNode s = node;   
        ListNode f = node;   

        while (f != null && f.next != null) {   
            s = s.next;   
            f = f.next.next;   
        }
        return s;   
    } 
    public void middleNode() {
        middleNode(head);
    }  
   
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
