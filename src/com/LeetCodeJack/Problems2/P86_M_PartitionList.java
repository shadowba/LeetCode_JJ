package com.LeetCodeJack.Problems2;

import java.util.*;

public class P86_M_PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyLess = new ListNode(0);
        ListNode dummyGreat = new ListNode(0);
        ListNode curLess = dummyLess;
        ListNode curGreat = dummyGreat;
        ListNode cur = head;
        ListNode temp;
        while (cur != null) {
            temp = cur.next;
            cur.next = null;
            if (cur.val >= x) {
                curGreat.next = cur;
                curGreat = curGreat.next;
            } else {
                curLess.next = cur;
                curLess = curLess.next;
            }
            cur = temp;
        }
        if (dummyLess.next != null) {
            head = dummyLess.next;
            curLess.next = dummyGreat.next;
        } else
            head = dummyGreat.next;

        return head;
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
