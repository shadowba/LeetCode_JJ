package com.LeetCodeJack.Problems;

import com.EssentialClasses.ListNode;

public class P141_LinkedListCycle {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;
            ListNode fastNode = head.next;
            ListNode slowNode = head;

            while (slowNode != null && fastNode != null) {
                if (fastNode == slowNode)
                    return true;
                slowNode = slowNode.next;
                if (fastNode.next == null)
                    return false;
                fastNode = fastNode.next.next;
            }
            return false;
        }
    }
}
