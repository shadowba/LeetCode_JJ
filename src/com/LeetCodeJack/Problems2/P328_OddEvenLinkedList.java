package com.LeetCodeJack.Problems2;

import com.EssentialClasses.ListNode;

public class P328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode evenHead = new ListNode(0);
        ListNode odd = head;
        ListNode even = evenHead;
        while (odd != null && odd.next != null) {
            even.next = odd.next;
            even = even.next;
            odd.next = even.next;

            even.next = null;
            odd = (odd.next == null) ? odd : odd.next;
        }
        odd.next = evenHead.next;
        return head;
    }
}
