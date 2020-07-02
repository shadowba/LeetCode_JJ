package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.ListNode;
import com.LeetCodeJack.Problems.P21_MergeTwoSortedLists;

public class test21_MergeTwoSortedLists {
    public static void main(String[] args) {
        P21_MergeTwoSortedLists tester = new P21_MergeTwoSortedLists();
        ListNode L1=new ListNode();
        ListNode L2=new ListNode();
        ListNode result;
        result= tester.mergeTwoLists(L1,L2);
        System.out.println(result);
    }
}
