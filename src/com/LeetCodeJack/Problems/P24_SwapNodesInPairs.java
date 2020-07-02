package com.LeetCodeJack.Problems;

public class P24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);

        dummyHead.next = swapTwo(head);
        return dummyHead.next;

//        ListNode current = head;
//        ListNode temp;
//        if (head.next != null)
//            dummyHead.next = head.next;
//        while(current != null && current.next != null){
//            temp = current.next;
//            current.next = temp.next;
//            temp.next = current;
//
//            current = current.next;
//        }
//
//        return dummyHead.next;
    }

    private ListNode swapTwo (ListNode current){
        if(current==null || current.next == null)
            return current;
        ListNode temp;

        temp = current.next;
        current.next = temp.next;
        temp.next = current;

        current.next = swapTwo (current.next);
        return temp;

    }
}
