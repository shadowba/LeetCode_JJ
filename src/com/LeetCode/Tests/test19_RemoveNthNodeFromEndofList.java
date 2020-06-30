package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.ListNode;
import com.LeetCodeJack.Problems.P19_RemoveNthNodeFromEndofList;

public class test19_RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode head = node1;
        ListNode result;

        P19_RemoveNthNodeFromEndofList tester = new P19_RemoveNthNodeFromEndofList();
        result = tester.removeNthFromEnd(head, 3);
        System.out.println("END");
    }
}
