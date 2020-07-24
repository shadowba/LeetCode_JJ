package com.LeetCode.Tests;

import com.LeetCodeJack.Problems2.P707_DesignLinkedList;

public class test707_DesignLinkedList {
    public static void main(String[] args) {
        P707_DesignLinkedList linkedList = new P707_DesignLinkedList();


//        linkedList.addAtHead(7);
//        linkedList.addAtHead(2);
//        linkedList.addAtHead(1);
//
//        linkedList.addAtIndex(3, 0);  // linked list becomes 1->2->3
//        linkedList.deleteAtIndex(2);
//
//
//        linkedList.addAtTail(4);
//        linkedList.get(4);            // returns 2
//        linkedList.addAtHead(4);
//        linkedList.addAtIndex(5, 0);
//        linkedList.addAtHead(6);

        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);
        linkedList.get(1);
        linkedList.deleteAtIndex(0);
        linkedList.get(0);
    }
}
