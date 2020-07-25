package com.LeetCodeJack.Problems2;
import com.EssentialClasses.*;
public class P142_LinkedListCycle2 {
    // 当slow 和 fast 相遇后，fast 每次走1步走到回环起始点的距离刚好等于head每次走一步走到回环起始点的距离，具体数学推导请看discussion 板块
    public ListNode detectCycle(ListNode head) {
        int fastSteps = 0;
        int slowSteps = 0;
        int size = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            slowSteps++;
            fast = fast.next.next;
            fastSteps += 2;
            if (fast == slow) {
                while (head != fast) {
                    head = head.next;
                    fast = fast.next;
                }
                return head;
            }
        }
        return null;
    }
}
