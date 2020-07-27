package com.LeetCodeJack.Problems2;
import java.util.*;


public class P61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null)
            return head;
        Map<Integer, ListNode> nodeMap = new HashMap<>();
        ListNode cur = head;
        int idx = 0;
        while(cur != null){
            nodeMap.put( idx++, cur);
            cur = cur.next;
        }
        int size = idx;
        int diff = k % size;
        idx = 0;
        int oldIdx = 0;

        // ListNode prev = null;
        ListNode dummy = new ListNode(0);
        cur = dummy;
        while(idx <= size - 1){
            oldIdx = idx - diff;
            while(oldIdx < 0)
                oldIdx += size;
            cur.next = nodeMap.get(oldIdx);
            cur = cur.next;
            idx++;
            if(oldIdx == 0)
                break;
        }
        while(idx <= size - 1){
            cur = cur.next;
            idx++;
        }
        cur.next = null;
        return dummy.next;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
