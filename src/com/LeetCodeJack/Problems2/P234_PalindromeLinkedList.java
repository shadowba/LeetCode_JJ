package com.LeetCodeJack.Problems2;

import com.EssentialClasses.ListNode;

import java.util.Stack;

public class P234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head != null && head.next == null)
            return true;
        Stack<ListNode> nodeStack = new Stack<>();
        int size = 1;
        ListNode cur = head;

        while (cur.next != null){
            cur = cur.next;
            size++;
        }
        cur = head;
        int idx = -1;
        if (size % 2 == 1)
            idx = size / 2 + 1;

        while (cur != null) {
            if(idx != -1 && size == idx){
                size--;
                cur = cur.next;
                continue;
            }
            if (nodeStack.isEmpty() || cur.val != nodeStack.peek().val)
                nodeStack.push(cur);
            else
                nodeStack.pop();
            cur = cur.next;
            size --;
        }
        if (nodeStack.isEmpty())
            return true;
        else
            return false;
    }
}
