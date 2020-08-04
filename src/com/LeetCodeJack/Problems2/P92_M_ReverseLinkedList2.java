package com.LeetCodeJack.Problems2;

public class P92_M_ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        ListNode xDummy = new ListNode(0);
        int idx = 0;
        dummy.next = head;
        ListNode cur = dummy;
        ListNode xCur = xDummy;
        ListNode temp;
        ListNode end = dummy;
        while (idx < m - 1) {
            cur = cur.next;
            idx++;
        }
        end = cur.next;
        idx += 1;
        while (m <= idx && idx <= n) {
            temp = cur.next.next;
            cur.next.next = xDummy.next;
            xDummy.next = cur.next;
            cur.next = temp;
            idx++;
        }
        if (cur.next != null) {
            end.next = cur.next;
        }
        cur.next = xDummy.next;
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
