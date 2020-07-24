package com.LeetCodeJack.Problems2;

public class P707_DesignLinkedList { // P707_DesignLinkedList
    testNode head;
    testNode tail;

    /**
     * Initialize your data structure here.
     */
    public P707_DesignLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        int idx = 0;
        testNode cur = head;
        int N = size();
        if (index > N) return -1;

        while (idx < index) {
            idx++;
            cur = cur.next;
        }
        return (cur == null) ? -1 : cur.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        testNode cur = new testNode(val);
        if(head == null){
            head = cur;
            return;
        }
        cur.next = head;
        head = cur;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {

        if (tail == null) {
            tail = new testNode();
            tail = head;
            while (tail.next != null)
                tail = tail.next;
        }
        testNode cur = new testNode(val);
        tail.next = cur;
        tail = cur;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        int idx = 0;
        testNode cur = head;
        int N = size();
        if (index > N) return;
        if (index == N) {
            addAtTail(val);
            return;
        }
        while (idx < index - 1) {
            idx++;
            cur = cur.next;
        }
        testNode newNode = new testNode(val);
        newNode.next = cur.next;
        cur.next = newNode;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        int idx = 0;
        testNode cur = head;
        testNode prev = head;
        int N = size();
        if (index > N) return;

        while (idx < index) {
            prev = cur;
            idx++;
            cur = cur.next;
        }
        prev.next = cur.next;
        cur.next = null;
    }

    private int size() {
        testNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    static private class testNode {
        public testNode next;
        public int val;

        testNode() {
        }

        testNode(int val) {
            this.val = val;
        }
    }
}
