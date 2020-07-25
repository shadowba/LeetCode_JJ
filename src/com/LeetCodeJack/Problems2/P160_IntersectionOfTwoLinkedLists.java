package com.LeetCodeJack.Problems2;

import com.EssentialClasses.ListNode;

public class P160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        ListNode cur;
        cur = headA;
        while (cur != null) {
            cur = cur.next;
            sizeA++;
        }
        cur = headB;
        while (cur != null) {
            cur = cur.next;
            sizeB++;
        }
        int diff = (sizeA >= sizeB) ? sizeA - sizeB : sizeB - sizeA;
        ListNode fast;
        ListNode slow;
        if (sizeA >= sizeB) {
            fast = headA;
            slow = headB;
        } else {
            fast = headB;
            slow = headA;
        }
        while (diff > 0) {
            fast = fast.next;
            diff--;
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
