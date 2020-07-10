package com.LeetCodeJack.Problems;

import com.EssentialClasses.ListNode;

public class P21_MergeTwoSortedLists {
    //      --- Recursion Method ---
    ListNode dummyNode = new ListNode(0);
    ListNode cur = dummyNode;

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        cur.next = helperMergeLists(l1, l2, cur);
        return dummyNode.next;
    }

    private ListNode helperMergeLists(ListNode l1, ListNode l2, ListNode cur) {
        if (l2 != null && l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        ListNode temp;
        if (l1.val <= l2.val) {
            cur.next = l1;
            temp = l1.next;
            l1 = temp;
        } else {
            cur.next = l2;
            temp = l2.next;
            l2 = temp;
        }
        cur = cur.next;
        cur.next = helperMergeLists(l1, l2, cur);
        return cur;
    }
}

//      --- Iteration Method ---

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode();
//        ListNode current = dummyHead;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                current.next = l1;
//                l1 = l1.next;
//            } else {
//                current.next = l2;
//                current = l2;
//            }
//            current = current.next;
//        }
//
//        if (l1 != null && l2 == null)
//            current.next = l1;
//        if (l2 != null && l1 == null)
//            current.next = l2;
//
//        return dummyHead.next;
//    }