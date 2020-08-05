package com.LeetCodeJack.Problems3;

import java.util.*;

public class P143_M_ReorderList {
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        int size = 0;
        ListNode cur = head;
        int mid;
        Stack<ListNode> stack = new Stack<>();
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        mid = size / 2;
        cur = head;
        size = 0;
        while (size < mid) {
            cur = cur.next;
            size++;
        }
        ListNode temp;
        while (cur.next != null) {
            temp = cur.next;
            cur.next = cur.next.next;
            temp.next = null;
            stack.push(temp);
        }
        cur = head;
        ListNode node;
        while (!stack.isEmpty()) {
            node = stack.pop();
            temp = cur.next;
            cur.next = node;
            node.next = temp;
            cur = cur.next.next;
        }
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
