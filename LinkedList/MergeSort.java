package LinkedList;

public class MergeSort {

    // public ListNode sortList(ListNode head) {
    // if (head == null && head.next == null) {
    // return head;
    // }

    // ListNode mid = middle(head);
    // ListNode left = sortList(head);
    // ListNode right = sortList(mid);

    // return merge(left, right);
    // }

    // public ListNode merge(ListNode l1, ListNode l2) {
    // ListNode dummy = new ListNode();
    // ListNode temp = dummy;
    // while (l1 != null && l2 != null) {
    // if(l1.val < l2.val) {
    // temp.next = l1;
    // l1 = l1.next;
    // temp = temp.next;
    // } else {
    // temp.next = l2;
    // l2 = l2.next;
    // temp = temp.next;
    // }
    // }
    // while (l1 != null) {
    // temp.next = l1;
    // l1 = l1.next;
    // temp = temp.next;
    // }
    // while (l2 != null) {
    // temp.next = l2;
    // l2 = l2.next;
    // temp = temp.next;
    // }
    // return temp.next;
    // }

    // public ListNode middle(ListNode head) {
    // ListNode slow = head;
    // ListNode fast = head;
    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // }
    // return slow;
    // }

    // sort List
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middle(head);
        ListNode midNext = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        return merge(left, right);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return dummy.next;
    }

    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
