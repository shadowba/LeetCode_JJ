package com.LeetCodeJack.Problems;

public class P19_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left=head;
        ListNode leftPrevious=null;
        ListNode right=head;
        ListNode oldHead=head;
        for(int i=0;i<n-1;i++){
            right=right.next;
            if(right==null)
                return new ListNode();
        }
        while(right.next!=null){
            leftPrevious=left;
            left=left.next;
            right=right.next;
        }

        if(leftPrevious==null&&left==head){
            head=left.next;
        }else{
            leftPrevious.next=left.next;
        }
        left.next=null;
        return head;
    }
}
