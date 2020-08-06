package com.LeetCodeJack.Problems3;

public class P147_M_InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode temp;
        ListNode cur;
        ListNode prev;
        ListNode temp2;
        if (dummy.next == null) {
            temp = head.next;
            head.next = null;
            dummy.next = head;
            head = temp;
        }

        while (head != null) {
            cur = dummy.next;
            prev = dummy;
            while (cur != null && cur.val < head.val) {
                prev = cur;
                cur = cur.next;
            }
            temp = head.next;
            temp2 = prev.next;
            head.next = null;
            prev.next = head;
            head = temp;
            prev.next.next = temp2;
        }
        return dummy.next;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
