package com.LeetCodeJack.Problems;

public class P83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode idx = dummyNode;
        ListNode temp;
        while (idx.next != null && idx.next.next != null) {
            if (idx.next.val == idx.next.next.val) {
                temp = idx.next.next.next;
                idx.next.next.next = null;
                idx.next.next = temp;
            } else {
                idx = idx.next;
            }
        }
        return dummyNode.next;
    }
}
