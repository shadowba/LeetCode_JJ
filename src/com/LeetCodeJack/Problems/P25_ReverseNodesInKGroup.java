package com.LeetCodeJack.Problems;

public class P25_ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return null;

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while(prev != null){
            prev = reverse(prev, k);
        }
        return dummyHead.next;
    }

    public ListNode reverse(ListNode prev, int k) {
        ListNode last = prev;
        for (int i = 0; i < k + 1; i++) {
            last = last.next;
            if (i != k && last == null)
                return null;
        }

        ListNode tail = prev.next;
        ListNode curr = prev.next.next;
        ListNode next;

        while (curr != last) {
            next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            tail.next = next;
            curr = next;
        }
        return tail;
    }


    private ListNode swapTwo(ListNode current, ListNode temp, int k) {
        k--;

        if (k < 0 || current == null || current.next == null)
            return current;

        temp = current.next;
        current.next = temp.next;
        temp.next = current;

        current.next = swapTwo(current.next, temp, k);

        return temp;
    }
}
