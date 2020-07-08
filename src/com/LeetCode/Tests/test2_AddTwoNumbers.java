package com.LeetCode.Tests;

import com.EssentialClasses.ListNode;
import com.LeetCodeJack.Problems.P2_AddTwoNumbers;

public class test2_AddTwoNumbers {
    public static void main(String[] args) {

        ListNode L1=new ListNode(5);
        ListNode head=L1;
        L1.next=new ListNode(4);
        L1=L1.next;
        L1.next=new ListNode(3);
        L1=head;

        ListNode L2=new ListNode(5);
        head=L2;
        L2.next=new ListNode(6);
        L2=L2.next;
        L2.next=new ListNode(4);
        L2=head;

        P2_AddTwoNumbers addTwoNumbers=new P2_AddTwoNumbers();
        ListNode result= addTwoNumbers.addTwoNumbers(L1,L2);

        System.out.println("END");
    }

}
