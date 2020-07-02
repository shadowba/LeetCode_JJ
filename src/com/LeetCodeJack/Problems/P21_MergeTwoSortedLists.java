package com.LeetCodeJack.Problems;

public class P21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                current = l2;
            }
            current = current.next;
        }

        if (l1 != null && l2 == null)
            current.next = l1;
        if (l2 != null && l1 == null)
            current.next = l2;

        return dummyHead.next;
    }
}


