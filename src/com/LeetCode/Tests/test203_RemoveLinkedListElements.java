package com.LeetCode.Tests;

import com.EssentialClasses.ListNode;
import com.LeetCodeJack.Problems2.P203_RemoveLinkedListElements;

public class test203_RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        P203_RemoveLinkedListElements tester = new P203_RemoveLinkedListElements();
        tester.removeElements(head, 1);
    }
}
