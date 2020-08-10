package com.LeetCodeJack.Problems3;

public class P237_E_DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        // ListNode dummy = new ListNode(0);
        // ListNode prev = dummy;
        // dummy.next = this.head;
        // ListNode cur = dummy.next;
        // while(cur.val != node.val){
        //     prev = prev.next;
        //     cur = cur.next;
        // }
        // prev.next = cur.next;
        // cur.next = null;
        // head = dummy.next;
        ListNode cur = node;
        while (cur.next.next != null) {
            cur.val = cur.next.val;
            cur = cur.next;
        }
        cur.val = cur.next.val;
        cur.next = null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
