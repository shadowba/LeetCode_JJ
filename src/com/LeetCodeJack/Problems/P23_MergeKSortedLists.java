package com.LeetCodeJack.Problems;

public class P23_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;

        ListNode mergedResult = lists[0];
        for (int i = 1; i < lists.length; i++){
            mergedResult = merge2Lists(mergedResult, lists[i]);
        }
        return mergedResult;
    }

    private ListNode merge2Lists (ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if(l1 != null && l2 == null)
            current.next = l1;
        else if(l1 == null && l2 != null)
            current.next = l2;

        return dummyHead.next;
    }
}
