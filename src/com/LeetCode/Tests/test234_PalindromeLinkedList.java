package com.LeetCode.Tests;

import com.EssentialClasses.ListNode;
import com.LeetCodeJack.Problems2.P234_PalindromeLinkedList;

public class test234_PalindromeLinkedList {
    public static void main(String[] args) {
        P234_PalindromeLinkedList tester = new P234_PalindromeLinkedList();
        ListNode head = new ListNode(1);
        ListNode cur = head;
        ListNode prev = cur;
        for(int i = 2; i <= 4;i++){
            prev = cur;
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        cur = prev;
        cur.next = new ListNode(4);
        cur= cur.next;
        for(int i = 3; i >= 1;i--){
            cur.next = new ListNode(i);
            cur = cur.next;
        }
//        cur.next = new ListNode(1);
//        cur = cur.next;
//        cur.next = new ListNode(2);
//        cur = cur.next;
//        cur.next = new ListNode(1);
//        cur = cur.next;
        tester.isPalindrome(head);
    }
}
