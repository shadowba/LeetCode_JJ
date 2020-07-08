package com.LeetCodeJack.Problems;

import com.EssentialClasses.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class P2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode digit1 = l1;
        ListNode digit2 = l2;
        ListNode digit3 = new ListNode();
        ListNode head = digit3;
        int carry = 0;

        while (digit1 != null || digit2 != null || carry == 1) {

            if (digit1 == null && digit2 != null)
                digit1 = new ListNode(0);

            if (digit2 == null && digit1 != null)
                digit2 = new ListNode(0);

            if (digit2 == null && digit1 == null && carry == 1) {
                digit1 = new ListNode(0);
                digit2 = new ListNode(0);
            }

            digit3.val = (digit1.val + digit2.val + carry) % 10;
            carry = (digit1.val + digit2.val + carry) / 10;

            digit2 = digit2.next;
            digit1 = digit1.next;
            if (digit1 != null || digit2 != null || carry == 1) {
                digit3.next = new ListNode();
                digit3 = digit3.next;
            }
        }
        return head;
    }
}


