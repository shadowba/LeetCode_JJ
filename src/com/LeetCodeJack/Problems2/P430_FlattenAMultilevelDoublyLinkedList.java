package com.LeetCodeJack.Problems2;

import java.util.*;

public class P430_FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        Stack<Node> nodeStack = new Stack<>();

        Node cur = head;
        if (cur == null)
            return cur;
        while (cur.child != null || cur.next != null || !nodeStack.isEmpty()) {
            if (cur.child != null) {
                if (cur.next != null)
                    nodeStack.push(cur.next);
                cur.next = cur.child;
                cur.child = null;
                cur.next.prev = cur;
            }
            if (cur.next == null && !nodeStack.isEmpty()) {
                cur.next = nodeStack.pop();
                cur.next.prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    private class Node {
        int val;
        Node prev;
        Node next;
        Node child;
    }
}
