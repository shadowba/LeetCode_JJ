package com.LeetCodeJack.Problems2;

import java.util.*;

public class P82_M_RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        Set<Integer> dupSet = new HashSet<>();
        dummyNode.next = head;
        ListNode cur = head;
        ListNode prev = dummyNode;
        ListNode temp;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                temp = cur.next.next;
                cur.next.next = null;
                cur.next = temp;
                dupSet.add(cur.val);
            }
            cur = cur.next;
        }
        cur = dummyNode;
        while (cur != null) {
            while (cur.next != null && dupSet.contains(cur.next.val)) {
                temp = cur.next.next;
                cur.next.next = null;
                cur.next = temp;
            }
            cur = cur.next;
        }
        head = dummyNode.next;
        return head;
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
