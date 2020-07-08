package com.LeetCodeJack.Problems;

import com.EssentialClasses.ListNode;

public class P206_ReverseLinkedList {
//     --- Recursive Method ---
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null)
//            return head;
//        ListNode p = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return p;
//    }

//      --- Iteration Method ---
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }
}
